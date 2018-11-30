package models;
import models.PaymentCheck;

public class Driver extends Person implements PaymentCheck{
	private String license;
    private double salary;
	private double fines;
	private double addings;
	
	//Constructor with the driver license
	public Driver(String name, String familyName, String license){
	 super(name,familyName);
	 this.license = license;
	 salary = 0;
	 fines = 0;
	 addings = 0;
    }

	public void setSalary(double amount){
		this.salary = amount;
	}
	
   //setAditionalNightHours(int hours) that pays 40 euros per additional extra hours
   public void setAditionalNightHours(int hours){
	   this.addings =  (double)(40*hours);
   }
   
   //setGottenFines (double fines) that is deduced from the driver's salary
   public void setGottenFines(double fines){
	   this.fines = fines;
   }
   
   // returning the gross salary
   public double getGrossWage(){
	  return (salary + addings);
   } 

   // returning the discounts and descriptions
   public String getDiscounts(){
	   return "Fines: " + fines;
   }
   
   // returning the net wage.
   public double calculateNetWage(){
	   return (getGrossWage()-fines);
   }
   
}