package com.sajilocareer.springboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sajilocareer.springboot1.dao.StudentDao;
import com.sajilocareer.springboot1.model.Student;

@Service
public class StudentService {

	
	private StudentDao studentDao;

	
	@Autowired
	public StudentService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void addStudent(Student student) {
		studentDao.save(student);
	}
    
	public List<Student> getStudentList(){
		return (List<Student>) this.studentDao.findAll();
	}

}
