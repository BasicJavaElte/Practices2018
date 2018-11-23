package models;

public class AirportTrip extends TravelTwoCities{
	
	private double speed;
	private double distance;
	private City cityOne;
	private City cityTwo;
	private String airportName;
	private double distanceToAirport;
	

	
public AirportTrip(double speed, double distance, City cityOne, City cityTwo,String airportName,double distanceToAirport){
	super(speed,distance,cityOne,cityTwo);
	this.airportName=airportName;
	this.distanceToAirport=distanceToAirport;
	
	
}
	
	public void setAirportName(String airportName){
		this.airportName=airportName;
	}
	
	public String getAirportName(){
		return airportName;
	}
	
	public void setDistanceToAirport(double distance){
		this.distanceToAirport=distanceToAirport;
	}
	
	public double getDistanceToAirport(){
		return distanceToAirport;
	}
}
