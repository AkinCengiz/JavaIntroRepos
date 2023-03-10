package org.akincengiz.university;

public class Student {
	String no;
	String name;
	String dateOfBirth;
	Department department;
	Professor advisor;
	Course[] coursesTaken;
//	{
//		Professor professor = new Professor();
//	}
	
	public Student()
	{
		this("","","",null,null,null);
	}
	public Student(String no, String name, String dateOfBirth)
	{
		this(no,name,dateOfBirth,null,null,null);
	}
	public Student(String no, String name, String dateOfBirth, Department department, Professor advisor, Course[] coursesTaken)
	{
		this.no = no;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.advisor = advisor;
		this.coursesTaken = coursesTaken;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Professor getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	public Course[] getCoursesTaken() {
		return coursesTaken;
	}
	public void setCoursesTaken(Course[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
}
