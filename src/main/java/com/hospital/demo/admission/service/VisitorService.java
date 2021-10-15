package com.hospital.demo.admission.service;

import java.util.List;

import com.hospital.demo.admission.model.VisitorDetails;

public interface VisitorService {

	VisitorDetails saveData(VisitorDetails data);
	
	List<VisitorDetails> findAllData();
}
