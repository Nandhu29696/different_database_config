package com.hospital.demo.admission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.demo.admission.model.AdmissionDetails;
import com.hospital.demo.admission.service.AdmissionService;

@RestController
@RequestMapping("/api/admission")
public class AdmissionController {

	@Autowired
	private AdmissionService admissionService;

	@PostMapping("/add")
	public AdmissionDetails saveData(@RequestBody AdmissionDetails data) {
		return admissionService.saveData(data);
	}

	@GetMapping("/findAlldata")
	public List<AdmissionDetails> findAlldata() {
		return admissionService.findAllDetails();
	}

}
