package com.example.springbootcrudproject.oper;

import com.example.springbootcrudproject.dto.StudentDto;
import com.example.springbootcrudproject.model.Student;

public interface StudentOper {
	public StudentDto mapPojoToDto(Student student);

	public Student mapDtoToPojo(StudentDto studentDto);
}
