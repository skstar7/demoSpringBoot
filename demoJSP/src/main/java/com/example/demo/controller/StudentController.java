package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	@Autowired
	CourseService courseService;

	@RequestMapping("/")
	public String demo() {
		return "admin";
	}
	
	@RequestMapping("/shtml")
	public String stdHtml() {
		return "student";
	}

	@PostMapping("/si")
	@ResponseBody
	public String insertStudent(@ModelAttribute StudentDto dto) {
		System.out.println(dto);
		String cn = dto.getCoursename();
		CourseDto courseDto = courseService.fetchCourse(cn);
		dto.setCourseDto(courseDto);
		System.out.println(dto);

		return studentService.insertStudent(dto);
	}

	@GetMapping("/fsid")
	public String fetchStudentById(@RequestParam int id, ModelMap map) {
		StudentDto studentDto = studentService.fetchStudentById(id);
		map.put("object", studentDto);
		return "fetchsid.html";
	}
	
	@GetMapping("/fsall")
	public String fetchAllStudent(ModelMap map) {
		List<StudentDto> list=studentService.fetchAllStudent();
		map.put("objects", list);
		return "fetchallstudent.html";
	}
}
