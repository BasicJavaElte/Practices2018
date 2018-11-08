import java.util.Scanner;
import java.util.ArrayList;

import models.Classroom;
import models.Student;

public class Controller{
	Scanner scanner = new Scanner(System.in);
	Classroom classroom;
	Classroom classroom2;
	
	public Controller(){
		 classroom = new Classroom();
		 classroom2 = new Classroom();
		 startClassroom();
		 startClassroom2();
	}	
	
	private void startClassroom(){
		classroom.addStudent(new Student("e","sth","123"));
		classroom.addStudent(new Student("b","sth","234"));
		classroom.addStudent(new Student("C","sth","345"));
		classroom.addStudent(new Student("u","sth","werwe"));
		classroom.addStudent(new Student("w","sth","543f"));
		classroom.addStudent(new Student("y","sth","ert345"));
		classroom.addStudent(new Student("g","sth","456"));
		classroom.addStudent(new Student("h","sth","789"));
	}
	
	private void startClassroom2(){
		classroom2.addStudent(new Student("e","sth","123"));
		classroom2.addStudent(new Student("b","sth","234"));
		classroom2.addStudent(new Student("C","sth","erter"));
		classroom2.addStudent(new Student("u","sth","sdfg"));
		classroom2.addStudent(new Student("w","sth","twert"));
		classroom2.addStudent(new Student("y","sth","345"));
		classroom2.addStudent(new Student("g","sth","utr"));
		classroom2.addStudent(new Student("h","sth","7546"));
	}
	
	public void addStudent(){
		System.out.println("Inform the student's name");
		String name = scanner.next();			
		
		System.out.println("Inform the student's family name");
		String family = scanner.next();	
		
		System.out.println("Inform the student's neptun");
		String neptun = scanner.next();	
		
		Student s = new Student(name,family,neptun);
		//System.out.println(s);
		
		classroom.addStudent(s);
	}
	
	public void removeStudent(){
		System.out.println("Inform Neptun code");
		String neptun = scanner.next();
		
		if(classroom.removeStudent(neptun)){
			System.out.println("Student removed");
		}else
			System.out.println("Student not found");
			
	}
	
	public void listStudents(){
		classroom.sortStudents();
		ArrayList <Student> students = classroom.getStudents();
		for(Student student : students){
			System.out.println(student);
		}
	}
	
	public void listRepeatedStudents(){
		ArrayList <Student> students =
			classroom.checkCommonStudents(classroom2);
		
		for(Student student : students){
			System.out.println(student);
		}
	}
	
	
}