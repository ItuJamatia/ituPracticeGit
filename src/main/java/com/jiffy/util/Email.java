package com.jiffy.util;

import java.io.*;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.*;

@Component
public class Email {

@Autowired
private JavaMailSender sender;

public void sendItinerary(String toAddress, String filePath) {
	
	MimeMessage message= sender.createMimeMessage();
	
	try {
		MimeMessageHelper messageHelper= new MimeMessageHelper(message, true);
		messageHelper.setTo(toAddress);
		messageHelper.setSubject("Jiffy Service Details");
		messageHelper.setText("Please find the attachment");
		messageHelper.addAttachment("service details", new File(filePath));
		sender.send(message);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
