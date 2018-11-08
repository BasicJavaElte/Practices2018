import java.util.Date;
import java.text.SimpleDateFormat;

import models.DateItinerary;

public class PlayingDates{
	
	public static void main (String args []) throws Exception{
		DateItinerary date = new DateItinerary();
		DateItinerary date1 = new DateItinerary(new Date(), new Date());
		DateItinerary date2 = new DateItinerary("2017/11/02","2135/08/10");
		
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);
	}
}