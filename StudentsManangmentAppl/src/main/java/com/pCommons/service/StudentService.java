package com.pCommons.service;

import org.springframework.stereotype.Service;

import com.pCommons.model.Courses;
import com.pCommons.model.Student;
import com.pCommons.model.StudentAddress;


@Service
public interface StudentService {

	Student updateDetails(int id,String email, String mobile, String fatherName,StudentAddress address);

	Courses getCourses(int courseId);

	void courseDelete(int courseId);

	
     
	   
	
}
