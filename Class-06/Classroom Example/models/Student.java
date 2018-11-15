package models;

public class Student implements Person{
	private String neptun;
	private String studentId;
	
	public Student(String name, String familyName, String neptun, String studentId){
		super(name, familyName);
		this.neptun = neptun;
		this.studentId = studentId;
	}
	
	public Student(){		
		setFamilyName("Smith");		
	}
	
	public String getNeptun(){
		return neptun;
	}
	
	public void setNeptun(String neptun){
		this.neptun = neptun;
	}
	
	@Override
	public String toString(){
		return super.toString()+" Student things StudentID: " 
		+ this.studentId ;
		
	}
	
}