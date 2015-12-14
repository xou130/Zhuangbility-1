package zb.model;

public class Student {
	private int ID;
	private String Name;
	private String Gender;
	private String Birthday;
	private String College;//学院
	private String Speciality;//专业
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public String getGender() {
		return Gender;
	}
	public String getBirthday() {
		return Birthday;
	}
	public String getCollege() {
		return College;
	}
	public String getSpeciality() {
		return Speciality;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public void setCollege(String college) {
		College = college;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
}