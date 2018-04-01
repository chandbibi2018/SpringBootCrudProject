package com.example.springbootcrudproject.service;

import java.util.List;

import com.example.springbootcrudproject.dto.StudentDto;



public interface StudentService {

	List<StudentDto> getStudentListService();

	List<StudentDto> insertStudentService(StudentDto studentDto);

	List<StudentDto> updateStudentService(StudentDto studentDto);

	List<StudentDto> deleteStudentService(StudentDto studentDto);

}
