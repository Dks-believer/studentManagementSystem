package com.pCommons.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCommons.model.*;

import com.pCommons.Repo.*;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private CourseRepo cRepo;
	
	
	@Override
	public Student updateDetails(int id,String email, String mobile, String fatherName,StudentAddress address) {
		// TODO Auto-generated method stub
		
       Optional<Student> optStudent = sRepo.findById(id);
       Student student1 = null;
       if(optStudent.isPresent())
       {
    	   student1 = optStudent.get();
    	   student1.setEmail(email);
    	   student1.setFatherName(fatherName);
    	   student1.setMobileNumber(mobile);
    	   student1.setStudentAddress(address);
    	
         sRepo.save(student1);
       }
		
		return student1;
	}


	@Override
	public Courses getCourses(int courseId) {
		// TODO Auto-generated method stub
		
		 Optional<Courses> optCourse = cRepo.findById(courseId);
	       
		 Courses course = null; 
		 if(optCourse.isPresent())
		 {
			 course = optCourse.get();
		 }
		return course;
	}


	@Override
	public void courseDelete(int courseId) {
		// TODO Auto-generated method stub
		
		
		Optional<Courses> opt = cRepo.findById(courseId);
		
		Courses  course = null;
		
		if(opt.isPresent())
		{
			course = opt.get();
	        cRepo.delete(course);
		}
		
	}

	
}
