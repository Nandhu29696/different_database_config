package com.hospital.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalityApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalityApplication.class, args);
		System.out.println("Ready...");
	}

}
