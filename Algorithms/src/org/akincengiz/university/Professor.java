package org.akincengiz.university;

public class Professor {
	String no;
	String name;
	String dateOfBirth;
	String rank;
	Department department;
	Course[] coursesGiven;
	Student[] advisee;
	
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
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Course[] getCoursesGiven() {
		return coursesGiven;
	}
	public void setCoursesGiven(Course[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
	public Student[] getAdvisee() {
		return advisee;
	}
	public void setAdvisee(Student[] advisee) {
		this.advisee = advisee;
	}	
}
