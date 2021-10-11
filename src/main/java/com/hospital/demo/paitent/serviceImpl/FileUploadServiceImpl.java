package com.hospital.demo.paitent.serviceImpl;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.hospital.demo.paitent.model.PaitentDetails;
import com.hospital.demo.paitent.repository.PaitentRepository;

@Service
public class FileUploadServiceImpl {

	private static final Logger log = LoggerFactory.getLogger(FileUploadServiceImpl.class);

	@Value("${s3.aws.access_key_id}")
	private String accessKey;

	@Value("${s3.aws.secret_access_key}")
	private String secretKey;

	@Value("${s3.region}")
	private String region;

	@Value("${s3.bucket}")
	private String bucketName;

	private AmazonS3 s3Client;

	@Autowired
	private PaitentRepository repo;
	/**
	 * intiialize amazon bucket for connection
	 */
	@PostConstruct
	private void initAmazon() {
		BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
		this.s3Client = AmazonS3ClientBuilder.standard().withRegion(region)
				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
	}

	public HashMap<String, Object> uploadImage(MultipartFile image) {

		HashMap<String, Object> metadata = new HashMap<>();

		if (!image.isEmpty()) {
			try {
				ObjectMetadata objectMetadata = new ObjectMetadata();
				objectMetadata.setContentType(image.getContentType());

				this.s3Client.putObject(new PutObjectRequest(bucketName, image.getOriginalFilename(),
						image.getInputStream(), objectMetadata));

				PaitentDetails details = repo.findById(2).get();
				details.setPaitentProof(image.getOriginalFilename());
				repo.save(details);
				
				metadata.put("message", "success");
				metadata.put("status", "200");

			} catch (IOException io) {

				metadata.put("message", "error");
				metadata.put("status", "500");

			}
		}

		return metadata;
	}
}
