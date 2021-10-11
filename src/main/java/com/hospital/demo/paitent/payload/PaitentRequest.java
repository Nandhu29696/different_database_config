package com.hospital.demo.paitent.payload;

import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class PaitentRequest {

	private int id;
	private String paitentName;
	private String gender;
	private String address;
	private String mobileNumber;
	private String emergencyMobileNum;
	private String typeOfIssue;

	private MultipartFile[] file;

	private List<UploadFileRequest> paitentProof;

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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmergencyMobileNum() {
		return emergencyMobileNum;
	}

	public void setEmergencyMobileNum(String emergencyMobileNum) {
		this.emergencyMobileNum = emergencyMobileNum;
	}

	public String getTypeOfIssue() {
		return typeOfIssue;
	}

	public void setTypeOfIssue(String typeOfIssue) {
		this.typeOfIssue = typeOfIssue;
	}

	public MultipartFile[] getFile() {
		return file;
	}

	public void setFile(MultipartFile[] file) {
		this.file = file;
	}

	public List<UploadFileRequest> getPaitentProof() {
		return paitentProof;
	}

	public void setPaitentProof(List<UploadFileRequest> paitentProof) {
		this.paitentProof = paitentProof;
	}

	public Date getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}

}
