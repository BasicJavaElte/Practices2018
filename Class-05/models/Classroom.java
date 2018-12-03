package models;

import java.util.ArrayList;

public class Classroom{
	private ArrayList<Person> students;

	//getters and setters
	public ArrayList<Person> getStudents(){
		return this.students;
	}

	public void setStudents(ArrayList<Person> students){
		this.students = students;
	}

	public Classroom(){
		students = new ArrayList<Person>();
	}

	public void addStudent(Person p){
		students.add(p);
	}

	public int howManyStudents(){
		return students.size();
	}
	
	public void sort(){	
		for(int i=0; i<students.size()-1; i++){
			for(int j=i+1; j<students.size(); j++){
				Person s1 = students.get(i);
				Person s2 = students.get(j);
				if(s1.getName().compareTo(s2.getName())>0){
					Person aux = s1;
					students.set(j,aux);
					students.set(i, s2);
				}
				
			}
		}
	}
	
	public void printAll(){
		for(Person p: students){
			System.out.println(p);
		}
	}
	
	public boolean removeStudent(String name){
		for(int i=0; i<students.size(); i++){
			
			Person student=students.get(i);
			
			if(student.getName().equalsIgnoreCase(name)){
				students.remove(i);
				return true;
			}
		}

		return false; 	
	}
}
