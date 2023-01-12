package org.akincengiz.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
	private String code;
	private String name;
	private Department department;
	private Professor teacher;
	private List<Student> students;
	private String day;
	private Date time;
	private static String[] days;
	
	{		
		students = new ArrayList<Student>();
	}
	static {
		days = new String[5];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
	}
	
	public Course()
	{
		this(null,null,null,null,null,0,null);
	}
	public Course(String code, String name, Department department, Professor teacher, Student student,int day, Date time)
	{
		this.code = code;
		this.name = name;
		this.department = department;
		this.teacher = teacher;
		this.students.add(student);
		this.day = days[day];
		this.time = time;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Professor getTeacher() {
		return teacher;
	}
	public void setTeacher(Professor teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(Student student) {
		this.students.add(student);
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
