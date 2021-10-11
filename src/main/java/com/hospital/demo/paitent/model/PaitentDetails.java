package com.hospital.demo.paitent.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "paitent_details")
public class PaitentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "paitent_name")
	private String paitentName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "address")
	private String address;

	@Column(name = "mobile_number")
	private int mobileNumber;

	@Column(name = "emergency_mobile")
	private int emergencyMobileNum;

	@Column(name = "typeof_issue")
	private String typeOfIssue;

	@Column(name = "paitent_proof")
	private String paitentProof;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "admit_date")
	private Date admitDate = new Date();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaitentName() {
		return paitentName;
	}

	public void setPaitentName(String paitentName) {
		this.paitentName = paitentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getEmergencyMobileNum() {
		return emergencyMobileNum;
	}

	public void setEmergencyMobileNum(int emergencyMobileNum) {
		this.emergencyMobileNum = emergencyMobileNum;
	}

	public String getTypeOfIssue() {
		return typeOfIssue;
	}

	public void setTypeOfIssue(String typeOfIssue) {
		this.typeOfIssue = typeOfIssue;
	}

	public Date getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}

	public String getPaitentProof() {
		return paitentProof;
	}

	public void setPaitentProof(String paitentProof) {
		this.paitentProof = paitentProof;
	}

}
