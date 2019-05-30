package com.youthquake.microservice.microservice.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.youthquake.microservice.microservice.domain.Target;

@Component
public class TargetMicroservice {

	private RestTemplate rest;
	private String url;

	
	
	public TargetMicroservice() {
		rest = new RestTemplate();
		url = "http://localhost:8080/target/microservice";
	}
	
	public void getTargetUserToCSV(){
		System.out.println("testando");
		Target[] targets = this.rest.getForObject(url, Target[].class);
		for(Target t:targets){
			System.out.println(t.toString());
		}
	}
}
