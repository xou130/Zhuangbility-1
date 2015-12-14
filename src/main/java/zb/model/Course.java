package zb.model;

public class Course {
	private int ID;
	private String Name;
	private int Value;//学分
	private int Time;//学时
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public int getValue() {
		return Value;
	}
	public int getTime() {
		return Time;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setValue(int value) {
		Value = value;
	}
	public void setTime(int time) {
		Time = time;
	}
	
}
