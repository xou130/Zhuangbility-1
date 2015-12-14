package zb.service.impl;

import org.springframework.stereotype.Service;
import zb.model.Teacher;
import zb.service.TeacherService;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService{
	public Teacher  getTeacherbyId(int ID){
		Teacher t = new Teacher();
		t.setID(0);
		t.setName("no name");
		t.setGender("no gender");
		t.setCollege("no college");
		
		return t;
	}
}
