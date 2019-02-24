package models;

//Import the Date package
import java.util.Date;

public abstract class Person{	
	private String name;
	private String familyName;
		
	public Person(String name, String familyName){		
		this.name = name;
		this.familyName = familyName;
	}
	
	//Getters and Setters
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;			
	}
	
	public String getFamilyName(){
		return familyName;
	}
	
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	
	@Override
	public String toString(){
		return "name: "+name+ "\nfamilyName: "+familyName ;		
	}
}