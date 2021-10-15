package com.hospital.demo.paitent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.demo.paitent.model.MedicalDetails;
import com.hospital.demo.paitent.repository.MedicalDetailsRepository;
import com.hospital.demo.paitent.service.MedicalDetailsService;

@Service
public class MedicalDetailsServiceImpl implements MedicalDetailsService {

	@Autowired
	private MedicalDetailsRepository repo;

	@Override
	public MedicalDetails saveData(MedicalDetails details) {
		// TODO Auto-generated method stub
		return repo.save(details);
	}

	@Override
	public List<MedicalDetails> findAllDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
