package com.hospital.demo.paitent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medical_details")
public class MedicalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String medicalStatement;

	private int paitentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicalStatement() {
		return medicalStatement;
	}

	public void setMedicalStatement(String medicalStatement) {
		this.medicalStatement = medicalStatement;
	}

	public int getPaitentId() {
		return paitentId;
	}

	public void setPaitentId(int paitentId) {
		this.paitentId = paitentId;
	}

}
