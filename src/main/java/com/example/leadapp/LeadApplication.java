package com.example.leadapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeadApplication {

	HashMap<Integer,String> map=new HashMap<Integer,String>();

	private String name="venkat";

	public static void main(String[] args) {
		SpringApplication.run(LeadApplication.class, args);
	}

}
