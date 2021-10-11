package com.hospital.demo.paitent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.demo.paitent.model.PaitentDetails;
import com.hospital.demo.paitent.repository.PaitentRepository;
import com.hospital.demo.paitent.service.PaitentService;

@Service
public class PaitentServiceImpl implements PaitentService {

	@Autowired
	private PaitentRepository paitentRepo;

	@Override
	public PaitentDetails saveDetails(PaitentDetails data) {
		// TODO Auto-generated method stub
		return paitentRepo.save(data);
	}

	@Override
	public List<PaitentDetails> findAllDetails() {
		// TODO Auto-generated method stub
		return paitentRepo.findAll();
	}

}
