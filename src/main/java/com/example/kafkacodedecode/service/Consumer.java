package com.example.kafkacodedecode.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "codeDecode_Topic",groupId = "codeDecode_group")
    public void listentoTopic(String message){
        System.out.println(message);
    }
}
