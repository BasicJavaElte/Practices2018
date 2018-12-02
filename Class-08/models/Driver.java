package models;

public class Driver extends Person implements PaymentCheck{

	private String driverLicense;
	private double salary;
	private int nightHours;
	private double fines;
	
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	
	//methods
	public Driver(String name, String familyName, String driverLicense){
		super(name, familyName);
		this.driverLicense = driverLicense;	
		
	}
	
	public void setAditionalNightHours(int hours){
		nightHours=hours;
	}
	
	public void setGottenFines (double fines){
		this.fines=fines;
	}
	public double getGrossWage(){
		return salary + (nightHours*40);
	}
	
	public String getDiscounts(){
		return "fines: "+fines;
	}
	
	
	public double calculateNetWage(){
		return getGrossWage()-fines;
	}	
	
	

}