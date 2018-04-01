package com.example.springbootcrudproject.dao;

import com.example.springbootcrudproject.model.Student;

public interface StudentDao {

	void getStudentList(Student student);
	
	void insertStudent(Student student);
	
	void updateStudent(Student student);
	
	void deleteStudent(Student student);
}
