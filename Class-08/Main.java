import models.Driver;

public class Main{
	public static void main (String args[]){
		
		Driver pedro = new Driver("Pedro","FamilyName","DriverLicense");
		
		pedro.setSalary(1000);
		pedro.setAditionalNightHours(5);
		pedro.setGottenFines(100);
		
		System.out.println("Pedro Gross Wage:");
		System.out.println(pedro.getGrossWage());
		// 1000 + 5*40
		
		
		System.out.println("Pedro Discounts:");
		System.out.println(pedro.getDiscounts());
		// Fines: 100
		
		System.out.println("Pedro will get:");
		System.out.println(pedro.calculateNetWage());		
		// (1000 + 5*40) - 100
	}
	
}