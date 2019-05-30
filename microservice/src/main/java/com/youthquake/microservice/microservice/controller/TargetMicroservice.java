package com.youthquake.microservice.microservice.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.assertj.core.util.Arrays;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.youthquake.microservice.microservice.domain.Target;
import com.youthquake.microservice.microservice.domain.User;

@Component
public class TargetMicroservice {

	private RestTemplate rest;
	private String url;
	
	public TargetMicroservice() {
		rest = new RestTemplate();
		url = "http://localhost:8080/target/microservice/";
	}
	
	
	
	public void getTargetUserToCSV(long idTarget) throws IOException{
		Target[] t = this.rest.getForObject(url+idTarget, Target[].class);
		
			FileWriter writer = new FileWriter("Objetivos_investidores.csv", true);
			CSVWriter csv = new 
					CSVWriter(writer, ';',
							  CSVWriter.NO_QUOTE_CHARACTER,
							  CSVWriter.DEFAULT_ESCAPE_CHARACTER,
							  CSVWriter.DEFAULT_LINE_END);	
		
			csv.writeNext(new String[]{"ID_target", "Description", "Date_Start", "Date_End", 
					"Name", "Percentage", "Value", "Value_Accumulated"});
			
		for(Target targets : t){
			csv.writeNext(new String[]{targets.getIdTarget(), targets.getDescription(), 
			targets.getDtStart(), targets.getDtEnd(), targets.getName(), 
			targets.getPercentage(), targets.getValue(), targets.getValueAccumulated()});	
		}
		
		csv.close();
	}
}
