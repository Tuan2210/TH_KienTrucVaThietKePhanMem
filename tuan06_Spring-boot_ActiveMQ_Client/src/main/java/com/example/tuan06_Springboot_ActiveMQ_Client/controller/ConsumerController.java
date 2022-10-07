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

@Component
@ComponentScan({"com.example.tuan06_Springboot_JPA_API_Docker_Server.controller"})
public class ConsumerController {
	
//	@Autowired
//	private ChuyenBayController chuyenBayController;
//	
//	@Autowired
//	private MayBayController mayBayController;
//	
//	@Autowired
//	private NhanVienController nhanVienController;
	
	@JmsListener(destination = "${myqueue}")
    public void handleMessage(TextMessage textMessage) throws JMSException {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
//		switch (textMessage.getText()) {
//		case "http://localhost:8081/api/chuyenbay":
//			System.out.println("Danh sách chuyến bay: \n" +gson.toJson(textMessage.getText()));
//			break;
//		case "http://localhost:8081/api/chuyenbay/gaden:DAD":
//			System.out.println("Danh sách chuyến bay đến Đà Lạt: \n" +gson.toJson(textMessage.getText()));
//			break;
//		default:
//			System.out.println("Mess received: " +textMessage.getText());
//			break;
//		}
		
		System.out.println("Mess received => " +textMessage.getText());
    }
}

