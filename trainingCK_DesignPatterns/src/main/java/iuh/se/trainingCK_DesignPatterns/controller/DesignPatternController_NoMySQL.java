package iuh.se.trainingCK_DesignPatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import iuh.se.trainingCK_DesignPatterns.Singleton_Pattern.Eager_Initialization;
import iuh.se.trainingCK_DesignPatterns.Singleton_Pattern.Lazy_Initialization;

@RestController
@RequestMapping("/api/design_patterns")
public class DesignPatternController_NoMySQL {
	
	@GetMapping("/singleton")
	public String getSingleton() {
//		Eager_Initialization eager1 = Eager_Initialization.getInstance();
//		eager1.setName("John");
//		System.out.println("Eager1: " +eager1.getName());
//		
//		Eager_Initialization eager2 = Eager_Initialization.getInstance();
//		System.out.println("Eager2: " +eager2.getName());
		
		Lazy_Initialization lazy1 = Lazy_Initialization.getInstance();
		lazy1.setName("John");
		System.out.println("Lazy1: " +lazy1.getName());
		
		Lazy_Initialization lazy2 = Lazy_Initialization.getInstance();
		lazy2.setName("Anna");
		System.out.println("Lazy2: " +lazy2.getName());
		
		return "running singleton...";
	}
}
