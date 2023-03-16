package com.midlaj.emailservice.controller;

import com.midlaj.emailservice.model.Email;
import com.midlaj.emailservice.service.EmailProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailProducer emailProducer;

    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody Email email) {
        emailProducer.send(email);
        return ResponseEntity.ok("Added to message Queue");
    }
}
