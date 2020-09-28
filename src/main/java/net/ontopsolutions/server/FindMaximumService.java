package net.ontopsolutions.server;

import io.grpc.stub.StreamObserver;
import net.ontopsolutions.computeraverage.FindMaximumRequest;
import net.ontopsolutions.computeraverage.FindMaximumResponse;
import net.ontopsolutions.computeraverage.OperationServiceGrpc;

public class FindMaximumService extends OperationServiceGrpc.OperationServiceImplBase {

    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {

        return new StreamObserver<FindMaximumRequest>() {
            int currentMaximum = Integer.MIN_VALUE;

            @Override
            public void onNext(FindMaximumRequest value) {
                int currentValue = value.getNumber();
                if (currentValue > currentMaximum) {
                    currentMaximum = currentValue;
                    responseObserver
                            .onNext(FindMaximumResponse
                                    .newBuilder()
                                    .setMaximum(currentMaximum)
                                    .build());
                }
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver
                        .onNext(FindMaximumResponse
                                .newBuilder()
                                .setMaximum(currentMaximum)
                                .build());

                responseObserver.onCompleted();
            }
        };
    }
}
