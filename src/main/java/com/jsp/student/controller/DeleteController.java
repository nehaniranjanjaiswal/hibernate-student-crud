package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class DeleteController {
public static void main(String[] args) {
	
	StudentService studentservice=new StudentService();
	  Student student1 =studentservice.deleteById(7);
	  System.out.println("delete successfully");
}
}
