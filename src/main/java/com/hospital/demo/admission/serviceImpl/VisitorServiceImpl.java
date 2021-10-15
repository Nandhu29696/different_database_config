package com.hospital.demo.admission.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.demo.admission.model.VisitorDetails;
import com.hospital.demo.admission.repository.VisitorDetailsRepository;
import com.hospital.demo.admission.service.VisitorService;

@Service
public class VisitorServiceImpl implements VisitorService {

	@Autowired
	private VisitorDetailsRepository repo;

	@Override
	public VisitorDetails saveData(VisitorDetails data) {
		// TODO Auto-generated method stub
		return repo.save(data);
	}

	@Override
	public List<VisitorDetails> findAllData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
