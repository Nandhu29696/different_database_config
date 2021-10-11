package com.hospital.demo.paitent.service;

import java.util.List;

import com.hospital.demo.paitent.model.PaitentDetails;

public interface PaitentService {

	PaitentDetails saveDetails(PaitentDetails data);
	
	List<PaitentDetails> findAllDetails();
}
