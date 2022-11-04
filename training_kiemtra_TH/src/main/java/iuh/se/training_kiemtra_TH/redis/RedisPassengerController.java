package iuh.se.training_kiemtra_TH.redis;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.se.training_kiemtra_TH.services.Passenger;

@RestController
@RequestMapping("/api/passengerservice")
public class RedisPassengerController {
	
	@Autowired
	private RedisPassengerServices redisPassengerServices;
	
	//Controller for redis-cache
	@GetMapping("/rediscache/passengers")
	public Map<String, Passenger> redisFindAll() {
		return redisPassengerServices.redisFindAll();
	}
	@GetMapping("/rediscache/passenger/{id}")
	public Passenger redisFindById(@PathVariable("id") String passId) {
		return redisPassengerServices.redisFindById(passId);
	}
	@PostMapping("/rediscache/passenger/add")
	public Passenger redisAdd(@RequestBody Passenger passenger) {
		return redisPassengerServices.redisAdd(passenger);
	}
	@PutMapping("/rediscache/passenger/{id}")
	public void redisUpate(@PathVariable("id") String passId, @RequestBody Passenger passengerDetails) {
		redisPassengerServices.redisUpate(passengerDetails);
	}
	@DeleteMapping("/rediscache/passenger/{id}")
	public void  redisDelete(@PathVariable("id") String passId) {
		redisPassengerServices.redisDelete(passId);
	}
}
