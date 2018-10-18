import java.util.Date;
import java.text.SimpleDateFormat;

public class PlayingDates{
	
	public static void main (String args []) throws Exception{
		Date d;
		
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
		//SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
		//SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yy");
		d = myFormat.parse("2015/05/05");
		
		System.out.println(myFormat.format(d));
		
	}
}