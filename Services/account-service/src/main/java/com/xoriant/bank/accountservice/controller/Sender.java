package com.xoriant.bank.accountservice.controller;


import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;


@Controller
public class Sender {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Bean
	public Queue f1() {
		return new Queue("EmailQ", false);
	}
	
	public void sendEmail(Map<String, Object> orderInfo) {
		rabbitTemplate.convertAndSend("EmailQ",orderInfo);
		
	}
}
