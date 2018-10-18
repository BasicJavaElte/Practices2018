import java.util.Date;
import java.text.SimpleDateFormat;

import models.Person;

public class MyClass{
	
	public static void main (String args [])throws Exception{
		
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
		//SimpleDateFormat myFormat = new SimpleDateFormat("ddMMyyyy")
		//SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy")
		
		Date d;
		
		d = myFormat.parse("1990/12/30");
		
		
		System.out.println(myFormat.format(d));
		
		Person p = new Person("Josh", "Smith");
		
		
		
		System.out.println(p);
		
		//String myAttribute = "whatever";
		//System.out.println("Hello World" + myAttribute);
	}
}