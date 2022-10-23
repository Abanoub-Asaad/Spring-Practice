package com.springemailclient;

import com.springemailclient.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailClientApplication {

	private EmailSenderService emailSenderService;

	@Autowired
	SpringEmailClientApplication(EmailSenderService emailSenderService) {
		this.emailSenderService = emailSenderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail() throws MessagingException {
		emailSenderService.sendEmailWithAttachment("reddit.clone.helper@gmail.com",
				"Please activate your account",
				"Thank you for signing up :)",
				"C:\\Users\\abano\\Downloads\\anki.jpg");
	}
}