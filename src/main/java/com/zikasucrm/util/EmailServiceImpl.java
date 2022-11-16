package com.zikasucrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	
	@Autowired
	private JavaMailSender javamailsender;
	
	@Override
	public void sendSimpleMail(String to, String subject, String emailBody) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setTo(to);
		smm.setSubject(subject);
		smm.setText(emailBody);
		javamailsender.send(smm);
		
	}

}
