package com.danbuchner.contactform.email;

import org.springframework.stereotype.Service;

@Service("emailService")
public interface EmailService {
	
    void sendEmail (String to, String subject, String text);
    
    void sendEmail (String to,String from, String subject, String text);

}