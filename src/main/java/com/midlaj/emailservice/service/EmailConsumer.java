package com.midlaj.emailservice.service;

import com.midlaj.emailservice.model.Email;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "email-topic", groupId = "email-group")
    public void consume(Email email) {
        try {
            emailService.sendEmail(email);
        } catch (MessagingException e) {
            System.out.println("Cannot send message");
            System.out.println(e);
        }

    }
}
