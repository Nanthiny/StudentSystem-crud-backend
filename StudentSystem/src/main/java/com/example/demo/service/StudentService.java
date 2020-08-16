package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
   private StudentRepo repo;
	
	public List<Student> getAllStudentsFromDb(){
		
		return repo.findAll();
		
	}
  public Optional<Student> getStudentByIdFromDb(int sid){
		
		return repo.findById(sid);
		
	}
  public Student addStudentToDb(Student student) {
 	 return repo.save(student);
  }
  
  public String deleteStudentFromDb(int sid) {
	 String result;
	 try {
		 repo.deleteById(sid);
		 result="student deleted";
		 return result;
	 }
	 catch(Exception ex) {
		 result="student cannot deleted";
		 return result;
	 }
  }
  public Student updateStudentToDb(Student student) {
	 	 return repo.save(student);
	  }
	  
  
	
}
