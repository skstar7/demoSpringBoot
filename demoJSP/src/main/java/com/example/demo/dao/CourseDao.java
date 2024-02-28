package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.CourseDto;
import com.example.demo.repository.CourseRepo;

@Component
public class CourseDao {
@Autowired
CourseRepo courseRepo;

public String insertCourse(CourseDto courseDto) {
	courseRepo.save(courseDto);
	return "inserted";
}

public CourseDto fetchCourse(String Coursename) {
	Optional<CourseDto> co=courseRepo.findById(Coursename);
	return co.get();
}
}
