package models;

public class Passenger extends Person{
	private long ticket;
	
	public Passenger(){	
		
	}
	
	public Passenger(String name, String familyName, long ticket){
		super(name, familyName);
		this.ticket = ticket;
	}
	
	public long getTicket(){
		return this.ticket;
	}
	
	public void setTicket(long ticket){
		this.ticket = ticket;
	}
	
	@Override
	public String toString(){
		return super.toString()+
		"\n ticket: "+ticket;
	}
	
}