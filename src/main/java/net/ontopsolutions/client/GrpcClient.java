package net.ontopsolutions.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.ontopsolutions.computeraverage.FindMaximumRequest;
import net.ontopsolutions.computeraverage.FindMaximumResponse;
import net.ontopsolutions.computeraverage.OperationServiceGrpc;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GrpcClient {

    public static void main(String[] args) {
        GrpcClient client = new GrpcClient();
        client.run();
    }

    private void run() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        callServer(managedChannel);
        managedChannel.shutdown();
    }

    private void callServer(ManagedChannel channel) {

        OperationServiceGrpc.OperationServiceStub asynClient =
                OperationServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaximumRequest> streamServerRequest = asynClient.findMaximum(new StreamObserver<FindMaximumResponse>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                System.out.println("Got maximum from server: " + value.getMaximum());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending messages");
            }
        });

        Arrays.asList(3, 5, 17, 9, 8, 30, 12).stream()
                .forEach(number -> {
                    System.out.println("Sending number " + number);
                    streamServerRequest.onNext(
                            FindMaximumRequest.newBuilder().setNumber(number).build());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        //we expect
        streamServerRequest.onCompleted();
        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
