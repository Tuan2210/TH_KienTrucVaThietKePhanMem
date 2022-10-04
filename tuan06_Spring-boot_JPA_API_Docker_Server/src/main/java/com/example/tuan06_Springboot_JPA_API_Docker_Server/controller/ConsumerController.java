package com.example.tuan06_Springboot_JPA_API_Docker_Server.controller;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.example.tuan06_Springboot_JPA_API_Docker_Server.controller")
public class ConsumerController {
	@JmsListener(destination = "${myqueue}")
    public void handleMessage(TextMessage textMessage) throws JMSException {
        System.out.println("Successful acceptance name: " + textMessage.getText());
    }
}
