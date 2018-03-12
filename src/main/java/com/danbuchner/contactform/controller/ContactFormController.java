package com.danbuchner.contactform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.danbuchner.contactform.email.EmailService;

@Controller
@RequestMapping("/")
public class ContactFormController {
	
	@Autowired
	EmailService emailService;
	
	@Value("${emailSender.to}")
	String emailTo;	
	
	@RequestMapping(value="/sendEmail")
	public String sendEmail(@RequestParam("name") String contactName,
			@RequestParam("email") String contactEmail,
			@RequestParam("message") String contactMsg) {		
		if((contactEmail!= null && contactEmail.length()>0)
				&& (contactName!= null && contactName.length()>0)) {	
			emailService.sendEmail(emailTo, contactEmail,"Contact from website", contactMsg);
			System.out.println("Email Sent");
		}
		return "index";
	}	
}