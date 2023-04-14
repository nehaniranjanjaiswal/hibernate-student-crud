package com.jsp.student.service;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class StudentService {
//for save
	StudentDao studentdao=new StudentDao();
	
public Student saveStudent(Student student) {
	if(student!=null) {
		student.setStatus("unapproved");
	}
	return studentdao.saveStudent(student);
}
//update
public Student updateByName(String name,int id) {
	Student s1=studentdao.getById(id);
	s1.setName("Muskan");
	return studentdao.updateById(s1);
	
}
//getById
public Student getById(int id) {
	if(id>0) {
		return studentdao.getById(id);
	}
	else {
		return null;
	}
}
public Student deleteById(int id) {
	Student s2=studentdao.getById(id);
	return studentdao.deleteById(s2);
	
}
public void getAllStudent() {
studentdao.getAllStudent();
}
}
