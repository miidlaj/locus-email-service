package com.midlaj.emailservice.service;

import com.midlaj.emailservice.model.Email;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;



    public void sendEmail(Email email) throws MessagingException {
        String from = "mumidlaj@gmail.com";
        String to = email.getTo();

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setSubject(email.getSubject());
        helper.setFrom(from);
        helper.setTo(to);

        String body = email.getBody();

        boolean html = true;
        helper.setText(body, html);

        mailSender.send(message);
    }
}
