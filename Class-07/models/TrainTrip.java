package models;
public class TrainTrip extends TravelTwoCities{
	
	
	
	private double speed;
	private double distance;
	private City cityOne;
	private City cityTwo;
	private String stationName;
	private char MaximunClass;

	
	

	public TrainTrip(double speed, double distance, City cityOne, City cityTwo,String stationName,char MaximunClass ){
		super(speed,distance,cityOne,cityTwo);
		this.stationName=stationName;
		this.MaximunClass=MaximunClass;
		
	}
	
	
	
	
	public char getMaximunClass(){
		return MaximunClass;
	}
	
	public void setMaximunClass(char MaximunClass){
		this.MaximunClass = MaximunClass;
	}
	
	public String getStationName(){
		return stationName;
	}
	
	public void setStationName(){
		this.stationName=stationName;
	}
	
	
	
}