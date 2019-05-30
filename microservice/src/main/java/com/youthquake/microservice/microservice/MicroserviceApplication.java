package com.youthquake.microservice.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.youthquake.microservice.microservice.controller.TargetMicroservice;

@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {
		TargetMicroservice ts = SpringApplication
				.run(MicroserviceApplication.class, args)
				.getBean(TargetMicroservice.class);
		
		ts.getTargetUserToCSV();
		
		System.exit(0);
	}
}
