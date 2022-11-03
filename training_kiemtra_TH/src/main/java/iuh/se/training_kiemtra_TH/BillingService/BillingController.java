package iuh.se.training_kiemtra_TH.BillingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/billingservice")
public class BillingController {

	@Autowired
	private BillingServices billingServices;
	
	@GetMapping("/billings")
	public List<Billing> listBillings() {
		return billingServices.listBillings();
	}
}
