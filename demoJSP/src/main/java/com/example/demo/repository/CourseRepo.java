package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.CourseDto;

@Repository
public interface CourseRepo extends JpaRepository<CourseDto, String>{

}
