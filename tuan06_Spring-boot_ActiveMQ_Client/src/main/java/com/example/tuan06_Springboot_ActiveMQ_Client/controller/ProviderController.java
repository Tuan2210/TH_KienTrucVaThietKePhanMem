//package com.example.tuan06_Springboot_ActiveMQ_Client.controller;
//
//import javax.annotation.Resource;
//import javax.jms.Queue;
//
//import org.springframework.jms.core.JmsMessagingTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ProviderController {
//	
//	@Resource
//    private Queue queue; //Inject message queue - chèn tin nhắn đợi
//	
//	@Resource
//    private JmsMessagingTemplate jmsTemplate;
//	
//	@RequestMapping("/send")
//	public void send(String text) {
//		//Method 1: add a message to the message queue
//		//The Queue queue we created before is used here
//		jmsTemplate.convertAndSend(queue, text);
//
//		//Method 2: in this way, you do not need to create a queue manually. The system will create a queue named test by itself
//		//If you use manual queue creation here, you need to write the @ EnableJms annotation to the startup class
//		//Here you can get the queue name in the configuration file and assign it to the first parameter
//		//jmsMessagingTemplate.convertAndSend("test", name);
//	}
//}
