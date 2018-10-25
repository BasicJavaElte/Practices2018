package models;

import java.util.ArrayList;

public class Classroom{
	ArrayList<Student> students;
	
	public Classroom(){
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student s){
		students.add(s);
	}
	
	/* Create a remove method that would go in 
		every student and delete the student with th same neptun
		
		public [boolean/void] removeStudent(String neptun)		
	*/
	
	/* Print all students on a sorted list
		Either create a new list, sort and print it 
		or sort the current list by name
		// I would use a bubble sort with set and get from ArrayList
		
		public void SortStudents();		
	*/
	
	/*
		Create a verify Classroom that would check the students
		against the current by NeptunCode
		
		check if the student is enrolled in the current classroom
		public boolean studentExists(String NeptunCode)
		
		verify one by one if the (this.student) students are enrolled in the second classroom
		public checkCommonStudents(Classroom classroom)
		
	*/
}