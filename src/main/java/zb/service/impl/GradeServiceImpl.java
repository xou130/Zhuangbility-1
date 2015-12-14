package zb.service.impl;

import org.springframework.stereotype.Service;

import zb.model.Grade;
import zb.service.GradeService;

@Service("GradeService")
public class GradeServiceImpl implements GradeService {

	public Grade getGradebyId(int ID) {
		Grade g = new Grade();
		g.setID(0);
		g.setStudent(null);
		g.setTeacher(null);
		g.setCourse(null);
		
		return g;
	}

}
