// Date has our Date class, no doubts we need that
import java.util.Date;

public class DateItinerary{
  private Date current;
	private Date goal;

  // Let's create this as a private object, so that we can access along the class


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


  @Override
	public String toString(){

		// if (isInTheFuture()){
    //   return "Traveling from "+myFormat.format(this.current)
		// 		+" to "+myFormat.format(this.goal)
		// 		+" we are traveling to the future";
		// }else
    //
		// if(isInThePast()){
		// 	return "Traveling from "+myFormat.format(this.current)
		// 		+" to "+myFormat.format(this.goal)
		// 		+" we are traveling to the past";
    //
    // }else
    //   // If it is not in the past either in the future? It is probably today =)
		// 	return "No trip on that";
	}
}
