package com.sajilocareer.springboot1.Contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sajilocareer.springboot1.model.Student;
import com.sajilocareer.springboot1.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentAPIController {

	private StudentService studentService;
	@Autowired
	public StudentAPIController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getAllStudent() {
		return this.studentService.getStudentList();
	}

	@PostMapping
	public HttpStatus saveStudent(@RequestBody Student student) {
		this.studentService.addStudent(student);
		return HttpStatus.OK;
	}

	@DeleteMapping("/{id}")
	public HttpStatus saveStudent(@PathVariable("id") Integer id) {
		this.studentService.deleteById(id);
		return HttpStatus.OK;
	}
	
	@GetMapping("/courses")
		public List<?> getAllcourse(){
			return new RestTemplate().getForObject ("http://localhost:9999/course", List.class);
		}
	}


