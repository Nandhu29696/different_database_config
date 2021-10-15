package com.hospital.demo.paitent.service;

import java.util.List;

import com.hospital.demo.paitent.model.MedicalDetails;

public interface MedicalDetailsService {

	MedicalDetails saveData(MedicalDetails details);
	
	List<MedicalDetails> findAllDetails();
}
