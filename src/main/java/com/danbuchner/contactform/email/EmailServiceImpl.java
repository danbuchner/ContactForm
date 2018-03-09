package com.danbuchner.contactform.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailServiceImpl implements EmailService{
	
	@Autowired
    public JavaMailSender emailSender;

	@Override
	public void sendEmail(String to, String subject, String text) {
		try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            emailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }
		
	}

	@Override
	public void sendEmail(String to, String from, String subject, String text) {
		try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText("Email from: " + from + "\n" + text);

            emailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }
		
	}

}
