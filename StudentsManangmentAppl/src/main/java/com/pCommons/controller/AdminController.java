package com.pCommons.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCommons.model.*;
import com.pCommons.service.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService aService;
	  
	@PostMapping("/admin/courses")
	public Courses uploadCourses(@RequestParam Courses course)
	{
		Courses subCourses = aService.uploadCourse(course);
		
		return subCourses;
		
	}
	
	
	@GetMapping("/student/{name}")
	public Student getStudentByName(@PathVariable("name") String StudentName)
	{
		Student student = aService.getStudentByName(StudentName);
		System.out.println("user login successful");
		return null;
		
	}
	
	
}
