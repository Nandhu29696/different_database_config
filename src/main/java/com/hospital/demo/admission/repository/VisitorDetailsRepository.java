package com.hospital.demo.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.demo.admission.model.VisitorDetails;

@Repository
public interface VisitorDetailsRepository extends JpaRepository<VisitorDetails, Integer>{

}
