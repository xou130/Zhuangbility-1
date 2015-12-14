package zb.model;

public class Grade {
	private int ID;
	private Student student;
	private Teacher teacher;
	private Course  course;
	
	public int getID() {
		return ID;
	}
	public Student getStudent() {
		return student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public Course getCourse() {
		return course;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
