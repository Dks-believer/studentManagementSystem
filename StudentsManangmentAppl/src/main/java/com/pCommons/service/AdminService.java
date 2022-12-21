package com.pCommons.service;

import org.springframework.stereotype.Service;

import com.pCommons.model.*;


@Service
public interface AdminService {

	Courses uploadCourse(Courses course);

	Student getStudentByName(String studentName);


	
}
