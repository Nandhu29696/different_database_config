package com.hospital.demo.paitent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.demo.paitent.model.MedicalDetails;
import com.hospital.demo.paitent.service.MedicalDetailsService;

@RestController
@RequestMapping("/api/medical")
public class MedicalDetailsController {

	@Autowired
	private MedicalDetailsService service;

	@PostMapping("/addMedical")
	public MedicalDetails saveData(@RequestBody MedicalDetails details) {
		return service.saveData(details);
	}

	@GetMapping("/findDetails")
	public List<MedicalDetails> findAllDetails() {
		return service.findAllDetails();
	}
}
