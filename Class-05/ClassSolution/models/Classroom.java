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
	
	public void sortStudents(){
		// make a bubble sort of the students
		for(int i=0; i<students.size(); i++){
			for (int j=i; j<students.size(); j++){
				Student aux;
				String name1 = students.get(i).getName();
				String name2 = students.get(j).getName();
				
				if(name1.compareTo(name2)>0){
					aux = students.get(i);
					students.set(i, students.get(j));
					students.set(j, aux);					
				}				
			}
		}
			
	}
	// return list of students that are in both classrooms
	
	
	public ArrayList<Student> checkCommonStudents(Classroom classroom){
		ArrayList<Student> repeatedStudents = new ArrayList<Student>();
		
		for (Student student :students){
			int index = 
				classroom.findStudentByNeptun(student.getNeptunCode());
				
			if(index >= 0)
				repeatedStudents.add(student);
			
		}
		
		return repeatedStudents;
			
		
 	}
	
}