package com.midlaj.emailservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Email Service",
				version = "1.0",
				description = "This project is only for send email asynchronously",
				contact = @Contact(
						name = "Muhammed Midlaj",
						email = "mumidlaj@gmail.com"
				),
				license = @License(
						name = "license",
						url = "license.com"
				)
		)
)
public class EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
