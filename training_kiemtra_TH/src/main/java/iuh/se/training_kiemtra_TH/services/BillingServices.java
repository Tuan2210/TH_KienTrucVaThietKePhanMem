package iuh.se.training_kiemtra_TH.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillingServices {

	@Autowired
	private BillingRepository billingRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Billing> listBillings() {
		return billingRepository.findAll();
	}
	
	public Billing addBilling(Billing billing) {
		return billingRepository.save(billing);
	}
	
	public ResponseTemplateDTO getBillingWithPassenger(String billId) {
//		Object objBilling = billingRepository.findById(billId); //not working
		Billing billing = billingRepository.findBillingById(billId); //use query mysql
		
		//call API normal
		Passenger passenger = restTemplate.getForObject("http://localhost:8081/api/passengerservice/passenger/" +billing.getPassengerId(), Passenger.class);
		
		//call API eureka-client (error not contain this URL)
//		Passenger passenger = restTemplate.getForObject("http://training_kiemtra_TH_EurekaClient_APIGateway/api/passengerservice/passenger/" +billing.getPassengerId(), Passenger.class);
		
		return new ResponseTemplateDTO(billing, passenger);
	}
	
}
