package models;

//Import the Date package
import java.util.Date;

public class Student{	
	
	//Attributes
	private String name;
	private String familyName;
	private Date birthday;
	private String neptunCode;
	
	
	//Constructors
	//Empty Constructor
	public Student(){}
	
	//Constructor with arguments	
	public Student(String name, String familyName, String neptun){		
		this.name = name;
		this.familyName = familyName;
		this.neptunCode = neptun;
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
	
	public Date getBirthday(){
		return birthday;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;		
	}
	
	public void setNeptunCode(String neptun){
		this.neptunCode = neptun;
	}
	
	public String getNeptunCode(){
		return this.neptunCode;
	}
	
	//custom methods
	
	public String fullHungarianName(){
		return familyName+" "+name;
	}
	
	@Override
	public String toString(){
		return "\n  Neptun: "+neptunCode+" Name "+name+ "  familyName "+familyName ;
		
		
	}
	
	
	
}