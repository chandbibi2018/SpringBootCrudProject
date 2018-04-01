package com.example.springbootcrudproject.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springbootcrudproject.dao.StudentDao;
import com.example.springbootcrudproject.model.Student;




@Repository(value = "StudentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void getStudentList(Student student) {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Student> list = session.createCriteria(Student.class).list();
		student.setStudentList(list);
		session.close();

	}

	@Override
	public void insertStudent(Student student) {
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			session.getTransaction().rollback();
			session.close();
		}

	}

	@Override
	public void updateStudent(Student student) {
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			session.getTransaction().rollback();
			session.close();
		}
	}

	@Override
	public void deleteStudent(Student student) {
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.delete(student);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			session.getTransaction().rollback();
			session.close();
		}
	}

}
