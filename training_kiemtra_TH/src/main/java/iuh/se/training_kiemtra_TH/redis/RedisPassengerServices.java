package iuh.se.training_kiemtra_TH.redis;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import iuh.se.training_kiemtra_TH.services.Passenger;

@Service
public class RedisPassengerServices {
	
	////// CRUD for redis-cache
	private RedisTemplate<String, Passenger> redisTemplate;
	
	private HashOperations<String, String, Passenger> hashOperations;
	
	public RedisPassengerServices(RedisTemplate<String, Passenger> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}
	
	public Map<String, Passenger> redisFindAll() {
		return hashOperations.entries("PASSENGER");
	}
	public Passenger redisFindById(String passId) {
		return hashOperations.get("PASSENGER", passId);
	}
	public Passenger redisAdd(Passenger passenger) {
		hashOperations.put("PASSENGER", passenger.getPassengerId(), passenger);
		return passenger;
	}
	public void redisUpate(Passenger passenger) {
		redisAdd(passenger);
	}
	public void redisDelete(String passId) {
		hashOperations.delete("PASSENGER", passId);
	}
}
