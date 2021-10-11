package com.hospital.demo.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.demo.admission.model.AdmissionDetails;

@Repository
public interface AdmissionRepository extends JpaRepository<AdmissionDetails, Integer>{

}
