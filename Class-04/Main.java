import java.util.Date;
import java.text.SimpleDateFormat;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            // Constructor with Strings
            DateItinerary d1 = new DateItinerary("20171001", "19900201");
            System.out.println(d1);

            // Empty Constructor
            DateItinerary d2 = new DateItinerary();
            System.out.println(d2);

            // Constructor with dates
            Date current = new Date();
            SimpleDateFormat my_format = new SimpleDateFormat("yyyyMMdd");
            Date goal = my_format.parse("20181111");
            DateItinerary d3 = new DateItinerary(current, goal);
            System.out.println(d3);
        }
        catch (Exception e)
        {
            System.out.println("Parse error!");
            System.exit(-1);
        }
    }
}