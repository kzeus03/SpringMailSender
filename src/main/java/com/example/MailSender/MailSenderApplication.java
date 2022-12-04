package com.example.MailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


import com.example.MailSender.Service.EmailSenderService;

@SpringBootApplication
public class MailSenderApplication {

	@Autowired
	private EmailSenderService senderService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendMail("enter your receiver mail", " test mail", "this is a test mail from spring boot application");
	}
	

}
