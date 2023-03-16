package com.midlaj.emailservice.service;

import com.midlaj.emailservice.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmailProducer {

    private static final String TOPIC = "email-topic";

    @Autowired
    private KafkaTemplate<String, Email> kafkaTemplate;

    public void send(Email email) {
        kafkaTemplate.send(TOPIC, email);
    }
}
