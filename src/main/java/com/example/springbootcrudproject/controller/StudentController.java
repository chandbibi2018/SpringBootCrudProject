package com.example.springbootcrudproject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrudproject.dto.StudentDto;
import com.example.springbootcrudproject.jsonview.StudentJsonView;
import com.example.springbootcrudproject.service.StudentService;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public @ResponseBody ResClass redirection() {
		System.out.println("IN REDIRECT");
		ResClass resClass = new ResClass();
		resClass.setUrl("http://www.google.com");
		resClass.setAttempt(1);
		return resClass;
	}

	@JsonView(StudentJsonView.StudentModelSummary.class)
	@RequestMapping(value = "/getStudentList", method = RequestMethod.POST)
	public @ResponseBody List<StudentDto> getStudentlist() {
		return studentService.getStudentListService();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@JsonView(StudentJsonView.StudentModelSummary.class)
	@RequestMapping(value = "/insertStudent", method = RequestMethod.POST)
	@Validated
	public @ResponseBody List<StudentDto> insertStudent(@RequestBody @Valid StudentDto studentDto) {
		return studentService.insertStudentService(studentDto);
	}

	@JsonView(StudentJsonView.StudentModelSummary.class)
	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public @ResponseBody List<StudentDto> updateStudent(@RequestBody StudentDto studentDto) {
		return studentService.updateStudentService(studentDto);
	}

	@JsonView(StudentJsonView.StudentModelSummary.class)
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
	public @ResponseBody List<StudentDto> deleteStudent(@RequestBody StudentDto studentDto) {
		return studentService.deleteStudentService(studentDto);
	}
}
