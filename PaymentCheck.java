package models;

public interface PaymentCheck{
	double getGrossWage(); // returning the gross salary
	String getDiscounts(); // returning the discounts and descriptions
	double calculateNetWage(); // returning the net wage.
}