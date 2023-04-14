package com.jsp.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.student.dto.Student;

public class StudentDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("neha");
	   EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	
	//save/insert
   public Student saveStudent(Student student) {
	       if(student!=null) {
		   et.begin();
		   em.persist(student);
		   et.commit();
		   return student;
	   }
	   return null;
   }
   public Student updateById(Student student) {
	   if(student!=null) {
		   et.begin();
	   em.merge(student);
		   et.commit();
		   return student;
	   }
	   return null;
   }
   
   
   public Student getById(int id) {
	   return em.find(Student.class, id);
	   }
  public Student deleteById( Student student) {
	  if(student!=null) {
		  et.begin();
		  em.remove(student);
		  et.commit();
		  
		  return student;
	  }
	  return  null;
  }
   public void getAllStudent() {
	   String sql="SELECT s From Student s";
		Query query=em.createQuery(sql);
		List<Student> student2=query.getResultList();
		for(Student s: student2 ) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			
			System.out.println("===========================");
		}
  }
   
}
