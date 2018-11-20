package models;

public class TravelTwoCities{
  private double speed;
  private double distance;
  private City cityOne;
  private City cityTwo;

  public TravelTwoCities(double speed, double distance, City cityOne, City cityTwo){
    this.speed = speed;
    this.distance = distance;
    this.cityOne = cityOne;
    this.cityTwo = cityTwo;
  }

  public boolean sameTrip(TravelTwoCities ttc){
    System.out.println(this.getCityTwo());
    return (this.getCityOne().equals(ttc.getCityOne()) && this.getCityTwo().equals(ttc.getCityTwo()));
  }

  public double averageTime(){
    return distance/speed;
  }

  public double getSpeed() {
    return speed;
  }
  public void setSpeed(double speed) {
    this.speed = speed;
  }
  public double getDistance() {
    return distance;
  }
  public void setDistance(double distance) {
    this.distance = distance;
  }
  public City getCityOne() {
    return cityOne;
  }
  public void setCityOne(City cityOne) {
    this.cityOne = cityOne;
  }
  public City getCityTwo() {
    return cityTwo;
  }
  public void setCityTwo(City cityTwo) {
    this.cityTwo = cityTwo;
  }
}
