import models.DateItinerary;

public class TimeMachine{
	public static void main (String args[]) throws Exception{
	
		DateItinerary di = new DateItinerary("19900202","19900303");
		System.out.println(di.getCurrent());
	}

}