package org.akincengiz.university;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private Professor head;
	private List<Course> courses;
	private List<Student> students;	
	{
		courses = new ArrayList<Course>();
		students = new ArrayList<Student>();
	}
	
	public Department()
	{
		this(null,null,null,null);
	}
	public Department(String name)
	{
		this(name, null, null, null);
	}
	public Department(String name, Professor head, Course course, Student student)
	{
		this.name = name;
		this.head = head;
		this.courses.add(course);
		this.students.add(student);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Professor getHead() {
		return head;
	}
	public void setHead(Professor head) {
		this.head = head;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(Course course) {
		this.courses.add(course);
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(Student student) {
		this.students.add(student);
	}
	
}
