package com.smartbudget.budgetmanagement.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "transactions", groupId = "budget-service-group")
    public void consume(String message) {
        // Логика обработки сообщений
        System.out.println("Consumed message: " + message);
    }
}

