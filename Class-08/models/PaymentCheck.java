package models;

public interface PaymentCheck {
	
	public double getGrossWage();
	public String getDiscounts();
	public double calculateNetWage();
	
}