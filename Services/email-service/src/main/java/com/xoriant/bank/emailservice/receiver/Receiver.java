package com.xoriant.bank.emailservice.receiver;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class Receiver {

	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RabbitListener(queues = "EmailQ")
	public void orderInfo(Map<String, Object> orderInfo) {

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("omkargujar8282@gmail.com");
	        msg.setFrom("omkargujar8282@gmail.com");
	        
	        long transactionId=(long)orderInfo.get("TRANSACTION_ID");
	        LocalDate transactionDate=(LocalDate)orderInfo.get("TRANSACTION_DATE");
	        double transactionAmount=(double)orderInfo.get("TRANSACTION_AMOUNT");
	        long fromAccount=(long)orderInfo.get("FROM_ACCOUNT");
	        double balance=(double)orderInfo.get("BALANCE");
	     
	        System.out.println(orderInfo);
	        
	        msg.setSubject("Your Transaction : "+transactionId+" Confirmation");
	        msg.setText("You Transaction Number : "+transactionId+" is completed successfully on "+transactionDate +" And Total Amount paid is "+transactionAmount+". Transaction ID: "+transactionId);

	        javaMailSender.send(msg);
	}
}
