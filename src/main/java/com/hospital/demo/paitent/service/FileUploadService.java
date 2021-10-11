package com.hospital.demo.paitent.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.hospital.demo.paitent.payload.UploadFileRequest;

public interface FileUploadService {

	String fileUplaod(String bucketName, MultipartFile file);

	String createBucket(String bucketName);

	List<String> getBucketList();

	List<UploadFileRequest> getBucketfiles(String bucketName);

	String softDeleteBucket(String bucketName);

	String hardDeleteBucket(String bucketName);

	String deleteFile(String bucketName, String fileName);

	UploadFileRequest downloadFile(String bucketName, String fileName);

}
