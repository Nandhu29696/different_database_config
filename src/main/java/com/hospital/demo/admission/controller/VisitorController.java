package com.hospital.demo.admission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.demo.admission.model.VisitorDetails;
import com.hospital.demo.admission.service.VisitorService;

@RestController
@RequestMapping("/api/visitor")
public class VisitorController {

	@Autowired
	private VisitorService service;

	@PostMapping("/addVisitor")
	public VisitorDetails saveDetails(@RequestBody VisitorDetails data) {
		return service.saveData(data);
	}

	@GetMapping("/findAlldata")
	public List<VisitorDetails> listAllData() {
		return service.findAllData();
	}
}
