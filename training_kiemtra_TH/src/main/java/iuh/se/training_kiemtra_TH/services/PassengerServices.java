package iuh.se.training_kiemtra_TH.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class PassengerServices {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	public List<Passenger> listPassengers() {
		return passengerRepository.findAll();
	}
	
	public Optional<Passenger> findPassengerById(String passId) {
		return passengerRepository.findById(passId);
	}
	
	public Passenger addPassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}
	
	public Passenger updatePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}
	
	public void deletePassenger(String passId) {
		passengerRepository.deleteById(passId);
	}
	
	////// CRUD for redis-cache
	private RedisTemplate<String, Passenger> redisTemplate;
	private HashOperations<String, String, Passenger> hashOperations;
	public PassengerServices(RedisTemplate<String, Passenger> redisTemplate) {
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
