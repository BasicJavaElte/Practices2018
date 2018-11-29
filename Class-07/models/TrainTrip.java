package models;

public class TrainTrip extends TravelTwoCities{
	
	private String nameOfStation;
	private char maximunClass;
	
	public TrainTrip
		(double speed, double distance, City cityOne, City cityTwo, String nameOfStation, char maximunClass){
		super(speed, distance, cityOne, cityTwo);
		this.nameOfStation = nameOfStation;
		this.maximunClass = maximunClass;
			
	}
	
	public char getMaximunClass(){
		return this.maximunClass;
	}
		
	
}