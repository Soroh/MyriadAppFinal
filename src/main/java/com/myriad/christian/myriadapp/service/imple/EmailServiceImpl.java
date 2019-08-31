package com.myriad.christian.myriadapp.service.imple;

import com.myriad.christian.myriadapp.models.Myriad;

import com.myriad.christian.myriadapp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {


	@Autowired
	private JavaMailSender emailSender;


	public EmailServiceImpl(JavaMailSender emailSender) {
		this.emailSender = emailSender;
	}

	@Override
	public void sendUserRegistrationConfirmEmail(Myriad user) {
		
		SimpleMailMessage message = new SimpleMailMessage(); 
	    message.setTo(user.getEmailAddress());
	    message.setSubject("Myriads for Jesus|Confirm Email");
	    message.setText(this.prepareUserRegistrationConfirmEmail(user));
	    emailSender.send(message);
		
	}

	@Override
	public void sendForgotPasswordEmail(Myriad user, String path, String token) {
		
		SimpleMailMessage message = new SimpleMailMessage(); 
	    message.setTo(user.getEmailAddress());
	    message.setSubject("Myriads for Jesus|Reset Password");
	    message.setText(this.prepareForgotPasswordEmail(user, path, token));
	    emailSender.send(message);
		
	}
	
	private String prepareUserRegistrationConfirmEmail(Myriad user) {

		String text = "Hello " + user.getFirstName() + ","
				+ "\nThank you for registering to our Library Portal. From now on you have access to enormous amount of books with just few clicks."
				+ "\n\nHave a nice day,"
				+ "\nLibrary Portal Team";
		
		return text;
	}

	private String prepareForgotPasswordEmail(Myriad user, String path, String token) {
		
		String url = path + "?userId=" + user.getMyriadId() + "&token=" + token;
		String text = "Hello " + user.getFirstName() + ","
				+ "\n\nWe have receive your request for resetting password to your account into our Library Portal"
				+ "\n\n If you have not requested it please let us know immediately."
				+ "\n Here is your personal link to a page where you can reset your password: "
				+ "\n\n" + url;
		
		return text;
	}
}
