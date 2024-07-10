package com.awsservices.awsproject.services;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

public class DynamoDbService {

    private final DynamoDbClient dbClient;

    public DynamoDbService(DynamoDbClient dbClient) {
        this.dbClient = dbClient;
    }

    // implement methods
}
