import java.util.Scanner;

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
		this.addStudent(new Student("Josh","sth","123"));
		this.addStudent(new Student("Student","sth","234"));
		this.addStudent(new Student("Josh Student","sth","345"));
		this.addStudent(new Student("addStudent","sth","werwe"));
		this.addStudent(new Student("classroom","sth","543f"));
		this.addStudent(new Student("println","sth","ert345"));
		this.addStudent(new Student("Inform","sth","456"));
		this.addStudent(new Student("name","sth","789"));
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