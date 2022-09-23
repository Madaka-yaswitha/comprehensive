package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Doctor;
import com.example.demo.Repository.DoctorRepository;

@Service
public class DoctorService {
	public DoctorRepository repository;
	
	public Doctor saveDoctor(Doctor doctor ) {
		return repository.save(doctor);
	}
	public List<Doctor> getAllDoctor() {
		return repository.findAll();
	}
	

}

	


