package com.hospital.demo.paitent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.demo.paitent.model.PaitentDetails;
import com.hospital.demo.paitent.service.PaitentService;

@RestController
@RequestMapping("/api/paitent")
public class PaitentController {

	@Autowired
	private PaitentService paitentService;

	@PostMapping("/addPaitent")
	public PaitentDetails saveData(@RequestBody PaitentDetails details) {
		return paitentService.saveDetails(details);
	}

	@GetMapping("/findPaitentData")
	public List<PaitentDetails> findAllData() {
		return paitentService.findAllDetails();
	}

}
