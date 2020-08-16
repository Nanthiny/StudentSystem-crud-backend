package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
     @GetMapping("/getAllStudents")
     @CrossOrigin(origins="http://localhost:4200")
	public List<Student> getAllStudents(){
		List<Student> students= new ArrayList();
		students=service.getAllStudentsFromDb();
		return students;
	}
     
     @GetMapping("/getStudentById/{sid}")
     @CrossOrigin(origins="http://localhost:4200")
 	public Optional<Student> getStudentById(@PathVariable("sid") int sid){
 		
 		return service.getStudentByIdFromDb(sid);
 	}
     
    @PostMapping("/addStudent")
    @CrossOrigin(origins="http://localhost:4200")
    public Student addStudent(@RequestBody Student student) {
    	return service.addStudentToDb(student);
    }
    
	@DeleteMapping("/deleteStudent/{sid}")
	@CrossOrigin(origins="http://localhost:4200")
	public String deleteStudent(@PathVariable("sid") int id) {
	    return service.deleteStudentFromDb(id);	
	}
	

}
