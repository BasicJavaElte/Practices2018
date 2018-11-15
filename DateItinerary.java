package models;
// Date has our Date class, no doubts we need that
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateItinerary{
  	private Date current;
	private Date goal;
	private SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");

// Let's create this as a private object, so that we can access along the class
	
	// Empty Constructor
	public DateItinerary(){
		this.current = new Date();
		this.goal = new Date();
	}

	// Constructor with dates
	public DateItinerary(Date current, Date goal){
		this.current = current;
		this.goal = goal;
	}

	public DateItinerary(String current, String goal) throws Exception{
		this.current = myFormat.parse(current);
		this.goal = myFormat.parse(goal);
	}

  // Getters and Setters the way we learned
	public void setCurrent(Date current){
		this.current = current;
	}
	public void setGoal(Date goal){
		this.goal = goal;
	}
	public Date getCurrent(){
		return this.current;
	}
	public Date getGoal(){
		return this.goal;
	}

	boolean isInTheFuture(){
		if(current.compareTo(goal) < 0){
			return true;
		}
		return false;
	}

	boolean isInThePast(){
		if(current.compareTo(goal) > 0){
			return true;
		}
		return false;
	}

  @Override
	public String toString(){
		if (isInTheFuture()){
       		return "Traveling from "+ myFormat.format(this.current)
		 		+" to "+myFormat.format(this.goal)
		 		+" we are traveling to the future";
		 }
		if(isInThePast()){
		 		return "Traveling from "+ myFormat.format(this.current)
		 			+" to "+myFormat.format(this.goal)
		 			+" we are traveling to the past";
      	}
     	else{
         	return "No trip on that";
		}
	}
}