package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class UpdateController {
public static void main(String[] args) {
	StudentService s3=new StudentService();
	  Student student=s3.updateByName("kajal", 3);
	  System.out.println("update successfully");
	  
}
}
