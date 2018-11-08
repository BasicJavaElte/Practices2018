import java.util.Scanner;
import java.util.ArrayList;

import models.Classroom;
import models.Student;

public class Controller{
	Scanner scanner = new Scanner(System.in);
	Classroom classroom;
	
	
	public Controller(){
		 classroom = new Classroom();
		 startClassroom();
	}	
	
	private void startClassroom(){
		classroom.addStudent(new Student("a","sth","123"));
		classroom.addStudent(new Student("b","sth","234"));
		classroom.addStudent(new Student("C","sth","345"));
		classroom.addStudent(new Student("d","sth","werwe"));
		classroom.addStudent(new Student("e","sth","543f"));
		classroom.addStudent(new Student("f","sth","ert345"));
		classroom.addStudent(new Student("g","sth","456"));
		classroom.addStudent(new Student("h","sth","789"));
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
		
		ArrayList <Student> students = classroom.getStudents();
		for(Student student : students){
			System.out.println(student);
		}
	}
	
	
}