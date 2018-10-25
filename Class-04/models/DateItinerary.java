package models;

// Date has our Date class, no doubts we need that
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateItinerary{
    private Date current;
	private Date goal;

    // Let's create this as a private object, so that we can access along the class
    public DateItinerary()
    {
        this.current = new Date();
        this.goal = new Date();
    }

    public DateItinerary(String current, String goal) throws Exception
    {
        SimpleDateFormat my_format = new SimpleDateFormat("yyyyMMdd");
        this.current = my_format.parse(current);
        this.goal = my_format.parse(goal);
    }

    public DateItinerary(Date current, Date goal)
    {
        this.current = current;
        this.goal = goal;
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

    // Getters and setters

    public boolean isInTheFuture()
    {
        return goal.getTime() - current.getTime() > 0;
    }

    public boolean isInThePast()
    {
        return goal.getTime() - current.getTime() < 0;
    }

  @Override
	public String toString(){
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        if (isInTheFuture()){
            return "Traveling from "+myFormat.format(this.current)
                    +" to "+myFormat.format(this.goal)
                    +" we are traveling to the future";
        } else if(isInThePast()){
            return "Traveling from "+myFormat.format(this.current)
                    +" to "+myFormat.format(this.goal)
                    +" we are traveling to the past";
        } else
        // If it is not in the past either in the future? It is probably today =)
            return "No trip on that";
    }
}