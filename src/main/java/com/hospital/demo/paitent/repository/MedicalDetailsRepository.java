package com.hospital.demo.paitent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.demo.paitent.model.MedicalDetails;

@Repository
public interface MedicalDetailsRepository extends JpaRepository<MedicalDetails, Integer>{

}
