package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdetails")
public class StudentDto {
	@Id
	private int studentid;
	@Column(nullable = false)
	private String studentname;
	@Column(nullable = false)
	private String studentemail;
	private String coursename;
	
	@OneToOne
	private CourseDto courseDto;
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	
	public CourseDto getCourseDto() {
		return courseDto;
	}
	public void setCourseDto(CourseDto courseDto) {
		this.courseDto = courseDto;
	}
	
	@Override
	public String toString() {
		return "StudentDto [studentid=" + studentid + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", coursename=" + coursename + ", courseDto=" + courseDto + "]";
	}
}