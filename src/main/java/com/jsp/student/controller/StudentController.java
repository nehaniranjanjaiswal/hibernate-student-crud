package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class StudentController {
public static void main(String[] args) {
	//save
	Student s1=new Student();
	s1.setName("priyanka");
	s1.setEmail("nj692098");
	s1.setStatus("approved");
	StudentService studentservice=new StudentService();
	  Student student1 =studentservice.saveStudent(s1);
	  if(student1!=null) {
		  System.out.println(student1.getId()+" save successfully");
	  }
	
}
}
