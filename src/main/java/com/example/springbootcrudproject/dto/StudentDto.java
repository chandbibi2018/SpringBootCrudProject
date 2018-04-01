package com.example.springbootcrudproject.dto;

import com.example.springbootcrudproject.jsonview.StudentJsonView;
import com.fasterxml.jackson.annotation.JsonView;



public class StudentDto {

	@JsonView(StudentJsonView.StudentModelSummary.class)
	int studentNo;

	@JsonView(StudentJsonView.StudentModelSummary.class)
	String studentName;

	@JsonView(StudentJsonView.StudentModelSummary.class)
	int studentAge;

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
