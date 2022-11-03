package iuh.se.training_kiemtra_TH.services;

import java.io.Serializable;

import iuh.se.training_kiemtra_TH.BillingService.Billing;
import iuh.se.training_kiemtra_TH.PassengerService.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Billing billing;
	private Passenger passenger;
}
