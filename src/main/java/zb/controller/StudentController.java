package zb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import zb.service.StudentService;

public class StudentController {
	
	private static Logger log = LoggerFactory.getLogger(StudentController.class);
	
	
	private StudentService studentService;
	
	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	
}
