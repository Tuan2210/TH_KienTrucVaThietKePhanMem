package com.example.tuan06_Springboot_ActiveMQ_Client.controller;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//import com.example.tuan06_Springboot_JPA_API_Docker_Server.controller.ChuyenBayController;
//import com.example.tuan06_Springboot_JPA_API_Docker_Server.controller.MayBayController;
//import com.example.tuan06_Springboot_JPA_API_Docker_Server.controller.NhanVienController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//@ComponentScan({"com.example.tuan06_Springboot_JPA_API_Docker_Server.controller"})
@Component
public class ConsumerController {
	
	@JmsListener(destination = "${myqueue}")
    public void handleMessage(TextMessage textMessage) throws JMSException {
		System.out.println("Mess received => " +textMessage.getText());
    }
}

