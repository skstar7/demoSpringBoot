package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.StudentDto;
import com.example.demo.repository.StudentRepo;

@Component
public class StudentDao {
	@Autowired
	StudentRepo studentRepo;

	public String insertStudent(StudentDto dto) {
		studentRepo.save(dto);
		return "data inserted";
	}
	
	public Optional<StudentDto> fetchStudentById(int id) {
		return studentRepo.findById(id);
	}
	
	public List<StudentDto> fetchAllStudent(){
		List<StudentDto> list=studentRepo.findAll();
		return list;
	}
}
