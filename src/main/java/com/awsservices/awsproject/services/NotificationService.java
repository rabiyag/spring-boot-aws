package com.awsservices.awsproject.services;

import org.springframework.stereotype.Service;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;

@Service
public class NotificationService {

    private final SnsClient snsClient;

    public NotificationService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public void publishMessage(String topicArn, String message) {
        snsClient.publish(PublishRequest.builder()
        .message(message)
        .topicArn(topicArn)
        .build());
    }
}
