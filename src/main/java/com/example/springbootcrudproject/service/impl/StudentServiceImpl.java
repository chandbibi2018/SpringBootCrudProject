package com.example.springbootcrudproject.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcrudproject.dao.StudentDao;
import com.example.springbootcrudproject.dto.StudentDto;
import com.example.springbootcrudproject.model.Student;
import com.example.springbootcrudproject.oper.StudentOper;
import com.example.springbootcrudproject.service.StudentService;



@Service(value = "StudentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Autowired
	private StudentOper studentOper;

	public void setStudentOper(StudentOper studentOper) {
		this.studentOper = studentOper;
	}

	@Override
	public List<StudentDto> getStudentListService() {
		Student student = new Student();
		studentDao.getStudentList(student);
		return student.getStudentList().stream().map(studentOper::mapPojoToDto).collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> insertStudentService(StudentDto studentDto) {
		Student student = studentOper.mapDtoToPojo(studentDto);
		studentDao.insertStudent(student);
		return getStudentListService();
	}

	@Override
	public List<StudentDto> updateStudentService(StudentDto studentDto) {
		Student student = studentOper.mapDtoToPojo(studentDto);
		studentDao.updateStudent(student);
		return getStudentListService();
	}

	@Override
	public List<StudentDto> deleteStudentService(StudentDto studentDto) {
		Student student = studentOper.mapDtoToPojo(studentDto);
		studentDao.deleteStudent(student);
		return getStudentListService();
	}

}
