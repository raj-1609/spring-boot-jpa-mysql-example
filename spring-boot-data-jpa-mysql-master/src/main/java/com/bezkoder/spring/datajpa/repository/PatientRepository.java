package com.bezkoder.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Patient;


public interface PatientRepository extends  JpaRepository<Patient, Integer> {

}
