package com.sajilocareer.springboot1.dao;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sajilocareer.springboot1.model.Student;


@Repository
public interface StudentDao extends CrudRepository<Student, Integer>{
	
	/*private List<Student>studentList = new ArrayList<>();
	
	public void addStudent(Student student) {
		this.studentList.add(student);
	}

    public List<Student> getStudentList(){
    return this.studentList;	*/
    }


