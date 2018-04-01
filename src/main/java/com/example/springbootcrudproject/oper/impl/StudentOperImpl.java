package com.example.springbootcrudproject.oper.impl;

import org.springframework.stereotype.Repository;

import com.example.springbootcrudproject.dto.StudentDto;
import com.example.springbootcrudproject.model.Student;
import com.example.springbootcrudproject.oper.StudentOper;

;

@Repository(value = "StudentOper")
public class StudentOperImpl implements StudentOper{

	@Override
	public StudentDto mapPojoToDto(Student student) {
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentNo(student.getStudentNo());
		studentDto.setStudentName(student.getStudentName());
		studentDto.setStudentAge(student.getStudentAge());
		return studentDto;
	}

	@Override
	public Student mapDtoToPojo(StudentDto studentDto) {
		Student student = new Student();
		student.setStudentNo(studentDto.getStudentNo());
		student.setStudentName(studentDto.getStudentName());
		student.setStudentAge(studentDto.getStudentAge());
		return student;
	}

}
