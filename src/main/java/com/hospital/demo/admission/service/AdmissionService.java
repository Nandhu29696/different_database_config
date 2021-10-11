package com.hospital.demo.admission.service;

import java.util.List;

import com.hospital.demo.admission.model.AdmissionDetails;

public interface AdmissionService {

	AdmissionDetails saveData(AdmissionDetails details);

	List<AdmissionDetails> findAllDetails();

}
