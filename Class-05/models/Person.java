package models;

import java.util.Date;

public class Person {
	private String name;
	private Date birthday;

	public Person(){

	}

	// My constructor with all arguments
	public Person(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

  // My equals method
	public boolean equals(Person other) {
		if (!this.name.equals(other.name))
			return false;
		if (!this.birthday.equals(other.birthday))
			return false;

		return true;
	}

  // Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public Date getBirthday(){
		return this.birthday;
	}

	public String toString(){
		return name+"\n"+birthday.toString();
	}

}
