package com.awsservices.awsproject.services;

import java.io.File;

import org.springframework.stereotype.Service;

import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@Service
public class StorageService {

    private final S3Client sClient;

    public StorageService(S3Client s3Client) {
        this.sClient = s3Client;
    }

    public void uploadFile(String bucketName, String key, File file) {

        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(key)
                .build();
        sClient.putObject(putObjectRequest, file.toPath());
    }
}
