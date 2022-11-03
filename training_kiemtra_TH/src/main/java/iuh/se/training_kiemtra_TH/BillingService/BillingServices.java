package iuh.se.training_kiemtra_TH.BillingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingServices {

	@Autowired
	private BillingRepository billingRepository;
	
	public List<Billing> listBillings() {
		return billingRepository.findAll();
	}
}
