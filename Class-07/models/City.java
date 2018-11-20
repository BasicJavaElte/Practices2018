package models;
public class City{
  private String name;

  public City(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
  	if (this == obj)
  		return true;
  	if (obj == null)
  		return false;
  	if (getClass() != obj.getClass())
  		return false;
  	City other = (City) obj;
  	if (name == null) {
  		if (other.name != null)
  			return false;
  	} else if (!name.equals(other.name))
  		return false;
  	return true;
  }

  public void setName(String name){
    this.name = name;
  }
}
