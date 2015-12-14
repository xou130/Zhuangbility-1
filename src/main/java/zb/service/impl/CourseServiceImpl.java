package zb.service.impl;

import org.springframework.stereotype.Service;
import zb.model.Course;
import zb.service.CourseService;

@Service("CourseService")
public class CourseServiceImpl implements CourseService {

	public Course getCoursebyId(int ID) {
		Course c = new Course();
		c.setID(0);
		c.setName("no name");
		c.setTime(0);
		c.setValue(0);
	
		return c;
		
	}
}
