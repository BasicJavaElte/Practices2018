import java.util.Date;
import java.text.SimpleDateFormat;
import Models.DateItinerary;

public class Dates{
	public static void main(String[] args) throws Exception{
		DateItinerary date = new DateItinerary("2017/10/10","2020/05/04");
		DateItinerary date2 = new DateItinerary("2017/10/10","2000/05/04");
		DateItinerary date3 = new DateItinerary(new Date(), new Date());
		DateItinerary date4 = new DateItinerary();
		
		System.out.println(date);	
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
	}	
}