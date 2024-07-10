package com.awsservices.awsproject.services;

import software.amazon.awssdk.services.lambda.LambdaClient;
import software.amazon.awssdk.services.lambda.model.InvokeRequest;

public class LambdaService {

    private final LambdaClient lambdaClient;

    public LambdaService(LambdaClient lambdaClient) {
        this.lambdaClient = lambdaClient;
    }

    public String invokeFunction(String functionName) {
        return lambdaClient.invoke(InvokeRequest.builder()
                .functionName(functionName)
                .build()).toString();
    }
}
