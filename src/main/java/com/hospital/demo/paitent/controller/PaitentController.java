package com.hospital.demo.paitent.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hospital.demo.paitent.model.PaitentDetails;
import com.hospital.demo.paitent.service.PaitentService;
import com.hospital.demo.paitent.serviceImpl.FileUploadServiceImpl;

@RestController
@RequestMapping("/api/paitent")
public class PaitentController {

	@Autowired
	private PaitentService paitentService;

	@Autowired
	private FileUploadServiceImpl fileUploadservice;

	@PostMapping("/addPaitent")
	public PaitentDetails saveData(@RequestBody PaitentDetails details) {
		return paitentService.saveDetails(details);
	}

	@GetMapping("/findPaitentData")
	public List<PaitentDetails> findAllData() {
		return paitentService.findAllDetails();
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public HashMap<String, Object> uploadImage(@RequestParam(value = "image") MultipartFile image) {
		return fileUploadservice.uploadImage(image);
	}
}
