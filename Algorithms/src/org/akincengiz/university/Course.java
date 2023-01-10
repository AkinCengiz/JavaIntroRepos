package org.akincengiz.university;

import java.util.Date;

public class Course {
	String code;
	String name;
	Department department;
	Professor teacher;
	Student[] students;
	String[] days;
	Date time;
	
	public Course()
	{
		this(null,null,null,null,null,null,null);
	}
	public Course(String code, String name, Department department, Professor teacher, Student[] students,String[] days, Date time)
	{
		this.code = code;
		this.name = name;
		this.department = department;
		this.teacher = teacher;
		this.students = students;
		this.days = days;
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
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public String[] getDays() {
		return days;
	}
	public void setDays(String[] days) {
		this.days = days;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
