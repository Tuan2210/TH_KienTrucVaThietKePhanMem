package iuh.se.training_kiemtra_TH_Eureka_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrainingKiemtraThEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingKiemtraThEurekaServerApplication.class, args);
	}

}
