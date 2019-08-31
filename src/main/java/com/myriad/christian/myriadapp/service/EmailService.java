package com.myriad.christian.myriadapp.service;


import com.myriad.christian.myriadapp.models.Myriad;

public interface EmailService {
	
	void sendUserRegistrationConfirmEmail(Myriad user);
	
	void sendForgotPasswordEmail(Myriad user, String path, String token);

}
