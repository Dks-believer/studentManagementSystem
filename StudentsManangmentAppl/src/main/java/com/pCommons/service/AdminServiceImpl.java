package com.pCommons.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pCommons.model.*;
import com.pCommons.Repo.*;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private CourseRepo cRepo;
	
	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public Courses uploadCourse(Courses course) {
		// TODO Auto-generated method stub
		
	     return cRepo.save(course);
	}



	@Override
	public Student getStudentByName(String studentName) {
		// TODO Auto-generated method stub
		
		Student student = sRepo.findByName(studentName);
		
		return student;
	}
	
	
	

	
}
