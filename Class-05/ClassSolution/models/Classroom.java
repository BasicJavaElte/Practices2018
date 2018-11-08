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
	
	public ArrayList<Student> getStudents(){
		return this.students;
	}
	
	// Return the index of the student according to Neptun code
	public int findStudentByNeptun(String neptun){
		
		for(int i=0; i<students.size(); i++){
			Student s = students.get(i);
			if (s.getNeptunCode().equalsIgnoreCase(neptun))
				return i;			
		}		
		return -1;
		
	}
	
	public boolean removeStudent(String neptun){
		
		int index = findStudentByNeptun(neptun);
		if(index<=0)
			return false;

		students.remove(index);
		return true;
		
	}
	public void SortStudents(){
		// make a bubble sort of the students
	}
	
	/* Print all students on a sorted list
		Either create a new list, sort and print it 
		or sort the current list by name
		// I would use a bubble sort with set and get from ArrayList
		
			
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