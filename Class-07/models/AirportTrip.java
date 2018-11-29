package models;

public class AirportTrip extends TravelTwoCities{
	private float distanceToAirport;
	private String airportName;
	
	
	public AirportTrip(double speed, double distance, City cityOne, City cityTwo, String airportName, float distanceToAirport){
		super(speed, distance, cityOne, cityTwo);
		this.distanceToAirport = distanceToAirport;
		this.airportName = airportName;
	}
	
	
	// Let's say that all the AirportTrip would have half an hour more 
	@Override
	public double averageTime(){
		return super.averageTime()+0.5;
	}
	
	
}