package com.example.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int sid;
	private String sname;
	private String desc;
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dob;
	private String subject;

	public Student(){}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Student(int sid, String sname, String desc, String dob, String subject) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.desc = desc;
		this.dob = dob;
		this.subject = subject;
	}
	  
	 
	   
	 
   
	
  
}
