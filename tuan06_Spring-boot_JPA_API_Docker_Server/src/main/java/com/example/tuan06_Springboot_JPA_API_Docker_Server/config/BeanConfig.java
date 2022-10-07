package com.example.tuan06_Springboot_JPA_API_Docker_Server.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

@Component
@EnableJms 						//Used to declare support for JMS annotations
public class BeanConfig {
	
    //Get the queue name in the configuration file
    @Value("${myqueue}") 		//@Value của springfrw, ko ph của lombok
    private String myqueue;

    //Define the queue for messages
    @Bean
    public Queue queue() {		//Queue của jms
        return new ActiveMQQueue(myqueue);
    }
}
