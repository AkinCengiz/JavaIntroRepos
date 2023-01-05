package org.akincengiz.university;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department1 = new Department();
		department1.name = "Software Engineering";
		Department department2 = new Department();
		department2.name = "Philosophy";
		
		Professor professor1 = new Professor();
		professor1.name="Hasan YILMAZ";
		Professor prof2 = new Professor();
		prof2.name = "Ali VELI";
		Professor prof3 = new Professor();
		prof3.name = "Ayse FATMA";
		
		Course course1 = new Course();
		course1.name = "Intro to Software Engineering";
		Course course2 = new Course();
		course2.name = "Ethics";
		Course course3 = new Course();
		course3.name = "Ontology";
		
		Student student1 = new Student();
		student1.name="Mina YITER";
		Student std1 = new Student();
		std1.name = "Zeynep GUL";
		Student std2 = new Student();
		std2.name = "Metin SAGLAM";
		Student std3 = new Student();
		std3.name = "Murat ATILGAN";
		
		//Department with Professor 
		department1.head=professor1;
		professor1.department= department1;
		
		department2.head = prof2;
		prof2.department = department2;
		prof3.department = department2;
		
		
		// Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
		course1.department=department1;
		department1.courses = new Course[100];
		department1.courses[0]= course1;
		
		course2.department = department1;
		department1.courses[1] = course2;
		
		course3.department = department2;
		department2.courses = new Course[100];
		department2.courses[0] = course3;
		
		course1.teacher = professor1;
		professor1.coursesGiven=new Course[5];
		professor1.coursesGiven[0]= course1;
		
		course2.teacher = prof2;
		prof2.coursesGiven = new Course[5];
		prof2.coursesGiven[0]= course2;
		
		course3.teacher = prof3;
		prof3.coursesGiven= new Course[5];
		prof3.coursesGiven[0]=course3;
		
		professor1.advisee = new Student[10];
		professor1.advisee[0]=student1;
		student1.advisor=professor1;
		
		prof2.advisee = new Student[10];
		prof2.advisee[0]=std1;
		std1.advisor = prof2;
		
		prof3.advisee = new Student[5];
		prof3.advisee[0]=std2;
		prof3.advisee[1]=std3;
		std2.advisor = prof3;
		std3.advisor = prof3;
		
		student1.coursesTaken= new Course[7];
		student1.coursesTaken[0]= course1;
		student1.coursesTaken[1]= course2;
		std1.coursesTaken = new Course[7];
		std1.coursesTaken[0]= course2;
		std1.coursesTaken[1] = course3;
		std2.coursesTaken = new Course[7];
		std2.coursesTaken[0]= course1;
		std2.coursesTaken[1]=course2;
		std2.coursesTaken[2] = course3;
		std3.coursesTaken = new Course[7];
		std3.coursesTaken[0] = course1;
		std3.coursesTaken[1] = course2;
		std3.coursesTaken[2] = course3;
		
		
		course1.students = new Student[100];
		course1.students[0] = student1;
		course1.students[1] = std2;
		course1.students[2] = std3;
		course2.students = new Student[100];
		course2.students[0] = student1;
		course2.students[1] = std1;
		course2.students[2] = std2;
		course2.students[3] = std3;
		course3.students = new Student[100];
		course3.students[0] = std1;
		course3.students[1] = std2;
		course3.students[2] = std3;
		
		System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
		System.out.println("Name of student student1's first course is " + student1.coursesTaken[1].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[1].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);
        
        System.out.println("Name of student student1's first course is " + std1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + std1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + std1.coursesTaken[0].teacher.department.name);
        
        System.out.println("Name of student student1's first course is " + std2.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + std2.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + std2.coursesTaken[0].teacher.department.name);
        
        System.out.println("Name of student student1's first course is " + std3.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + std3.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + std3.coursesTaken[0].teacher.department.name);
	}

}