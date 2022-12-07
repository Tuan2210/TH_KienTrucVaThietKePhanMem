package iuh.se.trainingCK_DesignPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import iuh.se.trainingCK_DesignPatterns.Singleton_Pattern.Eager_Initialization;

@SpringBootApplication
public class TrainingCkDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingCkDesignPatternsApplication.class, args);
		
//		System.out.println("Test singleton pattern:");
//		Eager_Initialization eager1 = Eager_Initialization.getInstance();
//		eager1.setName("John");
//		System.out.println("Eager1: " +eager1.getName());
//		
//		Eager_Initialization eager2 = Eager_Initialization.getInstance();
////		eager2.setName("Kelly");
//		System.out.println("Eager2: " +eager2.getName());
//		System.out.println("====================");
		
	
	}

}
