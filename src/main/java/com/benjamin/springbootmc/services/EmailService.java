package com.benjamin.springbootmc.services;

import org.springframework.mail.SimpleMailMessage;

import com.benjamin.springbootmc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);

}
