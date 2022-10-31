package com.example.tuan09_Springboot_RedisTemplate_API_Docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.tuan09_Springboot_RedisTemplate_API_Docker.entities.NguoiDung_User;

@SpringBootApplication
public class Tuan09SpringBootRedisTemplateApiDockerApplication {
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean
	RedisTemplate<String, NguoiDung_User> redisTemplate() {
		RedisTemplate<String, NguoiDung_User> redisTemplate = new RedisTemplate<String, NguoiDung_User>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(Tuan09SpringBootRedisTemplateApiDockerApplication.class, args);
	}

}
