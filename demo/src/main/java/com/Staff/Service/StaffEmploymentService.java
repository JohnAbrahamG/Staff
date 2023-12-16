package com.Staff.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Staff.Controller.Repository.StaffEmploymentRepository;
import com.Staff.Model.StaffEmployement;

@Service
public class StaffEmploymentService {

@Autowired
 private final StaffEmploymentRepository staffEmploymentRepository;

 
 public StaffEmploymentService(StaffEmploymentRepository staffEmploymentRepository) {
     this.staffEmploymentRepository = staffEmploymentRepository;
 }

 public void saveStaffEmployment(StaffEmployement staffEmployment) {
     // Add any business logic here
	 staffEmploymentRepository.save(staffEmployment);
 }
}
