package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.StudentDto;

public interface StudentRepo extends JpaRepository<StudentDto, Integer> {

}
