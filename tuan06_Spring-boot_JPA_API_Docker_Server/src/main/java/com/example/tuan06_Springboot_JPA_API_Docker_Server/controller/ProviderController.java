package com.example.tuan06_Springboot_JPA_API_Docker_Server.controller;

import javax.annotation.Resource;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
//@EnableJpaRepositories(basePackages = "com.example.tuan06_Springboot_JPA_API_Docker_Server.repositories")
public class ProviderController {

	@Resource
	private Queue queue; //Inject message queue - chèn tin nhắn đợi

	@Resource
	private JmsMessagingTemplate jmsTemplate;

	@Autowired
	private ChuyenBayController chuyenBayController;

	@RequestMapping("/send")
	public void send(String text) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		switch (text) {
		case "http://localhost:8081/api/chuyenbay":
			jmsTemplate.convertAndSend(queue, "Danh sách các chuyến bay: \n" +gson.toJson(chuyenBayController.listChuyenBays()));
			break;
		case "http://localhost:8081/api/chuyenbay/gaden:DAD":
			jmsTemplate.convertAndSend(queue, "Danh sách chuyến bay đến Đà Lạt: \n" +gson.toJson(chuyenBayController.findChuyenBayByGaDen("DAD")));
			break;
		default:
			jmsTemplate.convertAndSend(queue, text);
			break;
		}
		//Method 1: add a message to the message queue
		//The Queue queue we created before is used here

		////
		//Method 2: in this way, you do not need to create a queue manually. The system will create a queue named test by itself
		//If you use manual queue creation here, you need to write the @ EnableJms annotation to the startup class
		//Here you can get the queue name in the configuration file and assign it to the first parameter
		//jmsMessagingTemplate.convertAndSend("test", name);
	}
}
