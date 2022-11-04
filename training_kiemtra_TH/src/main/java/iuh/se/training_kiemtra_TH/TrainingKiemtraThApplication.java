package iuh.se.training_kiemtra_TH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;

import iuh.se.training_kiemtra_TH.services.Passenger;

@SpringBootApplication
public class TrainingKiemtraThApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	//redis-cache
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	@Bean
	RedisTemplate<String, Passenger> redisTemplate() { //theo yêu cầu đề là tạo cache-redis cho Passenger
		RedisTemplate<String, Passenger> redisTemplate = new RedisTemplate<String, Passenger>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(TrainingKiemtraThApplication.class, args);
	}

}
