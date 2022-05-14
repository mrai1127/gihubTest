package com.sajilocareer.springboot1.Contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sajilocareer.springboot1.model.Student;
import com.sajilocareer.springboot1.service.StudentService;

@Controller
public class StudentController {

	
	private StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/")
	public String index() {
		
/*		Student student = new Student ( 1, "Mau", "Bhadrapur");
		Student student1 = new Student ( 2, "Bau", "vhadrapur");
	     this.studentService.addStudent(student); 
	     this.studentService.addStudent(student1);
	     List<Student> studentList = this.studentService.getStudentList();
	     
	     
	     studentList.forEach(studentObj ->{
	    	 System.out.println(studentObj.getName());
	     });
*/	     
	     return "index";
       }

	@GetMapping("/listStudent")
	public ModelAndView listStudent(ModelAndView modelAndView) {
	/*	Student student = new Student ( 1, "Mau", "Bhadrapur");
		Student student1 = new Student ( 2, "Bau", "vhadrapur");  
	     this.studentService.addStudent(student); 
	     this.studentService.addStudent(student1);*/
	     List<Student> studentList = this.studentService.getStudentList();
	     
	     
	     
	     
	     
	     
	    modelAndView.addObject("studentList", studentList); 
	    modelAndView.setViewName("studentlist");
		return modelAndView;
       }
	
	@PostMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student student, ModelAndView modelAndView){
		System.out.println("Add Student");
		System.out.println(student);
		this.studentService.addStudent(student);
		modelAndView.addObject("studentList", this.studentService.getStudentList());
		modelAndView.setViewName("studentlist");
		return modelAndView;
	}
	
	@GetMapping("/addStudentForm")
	public ModelAndView addStudent(ModelAndView modelAndView){
		modelAndView.addObject("student", new Student());
		modelAndView.setViewName("addStudent");
		return modelAndView;

	}
	
	@GetMapping("/updateStudentForm")
	public ModelAndView updateStudentForm(@RequestParam("id") Integer id, ModelAndView modelAndView) throws NotFoundException{
		Student student = this.studentService.findById(id);
		if(student == null) {
			throw new NotFoundException();
			
		}
		modelAndView.addObject("student", student);
		modelAndView.setViewName("updateStudentForm");
		return modelAndView;
	}
	
	@PostMapping("updateStudent")
	public ModelAndView updateStudent(@ModelAttribute Student student, ModelAndView modelAndView) {
		System.out.println("Update Student");
		System.out.println(student);
		this.studentService.addStudent(student);
		modelAndView.addObject("studentList", this.studentService.getStudentList());
		modelAndView.setViewName("studentlist");
		return modelAndView;
		
	}
	
	@GetMapping("/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam("id") Integer id, ModelAndView modelAndView){
		this.studentService.deleteById(id);
		modelAndView.addObject("studentList", this.studentService.getStudentList());
		modelAndView.setViewName("studentlist");
		return modelAndView;
    }
	
	@GetMapping("/findByName")
	public ModelAndView findByName(@RequestParam("name") String name, ModelAndView modelAndView){
		List<Student> studentList = this.studentService.findByName(name);
		modelAndView.addObject("studentList", studentList);
		modelAndView.setViewName("studentlist");
		return modelAndView;
    }
}
