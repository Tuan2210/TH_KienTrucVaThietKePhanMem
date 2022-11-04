package iuh.se.training_kiemtra_TH.services;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//link run call api 2 or more services at the same time, and other services of Microservice: https://www.youtube.com/watch?v=BnknNTN8icw

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Billing billing;
	private Passenger passenger;
}
