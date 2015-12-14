package zb.service.impl;

import org.springframework.stereotype.Service;
import zb.model.*;
import zb.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	public Student getStudentbyId(int ID){
		Student stu = new Student();
		stu.setID(0);
		stu.setName("no name");
		stu.setGender("no gender");
		stu.setBirthday("no birthday");
		stu.setCollege("no college");
		stu.setSpeciality("no speciality");
		
		return stu;
	}
}
