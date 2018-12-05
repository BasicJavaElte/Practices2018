package models;

public class Driver extends Person implements PaymentCheck{
	private String driveLicense;
	public double salary;
	public int hours;
	public double fines;
	public double addings;


	public Driver(String name, String familyName, String driveLicense){
		super(name, familyName);
		this.driveLicense = driveLicense;
	}

	public String getDriveLicense(){
		return this.driveLicense;
	}

	public void setDriveLicense(String driveLicense){
		this.driveLicense = driveLicense;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public void setAditionalNightHours(int hours){
		addings = 40 * hours;
	}

	public void setGottenFines (double fines){
		this.fines = fines;
	}

	public double getGrossWage(){
		return (salary + addings);
	} // returning the gross salary

	public String getDiscounts(){
		return "Fines: " + fines;
	} // returning the discounts and descriptions

	public double calculateNetWage(){
		return (getGrossWage() - fines);
	} // returning the net wage.
}