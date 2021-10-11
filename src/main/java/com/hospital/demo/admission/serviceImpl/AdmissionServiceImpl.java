package com.hospital.demo.admission.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.demo.admission.model.AdmissionDetails;
import com.hospital.demo.admission.repository.AdmissionRepository;
import com.hospital.demo.admission.service.AdmissionService;

@Service
public class AdmissionServiceImpl implements AdmissionService {

	@Autowired
	private AdmissionRepository admissionRepo;

	@Override
	public AdmissionDetails saveData(AdmissionDetails details) {

		return admissionRepo.save(details);
	}

	@Override
	public List<AdmissionDetails> findAllDetails() {

		return admissionRepo.findAll();
	}
}
