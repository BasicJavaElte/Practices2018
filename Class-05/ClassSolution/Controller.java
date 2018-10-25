import java.util.Scanner;

import models.Classroom;
import models.Student;

public class Controller{
	Scanner scanner = new Scanner(System.in);
	Classroom classroom;
	
	
	public Controller(){
		 classroom = new Classroom();
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
	
	
}