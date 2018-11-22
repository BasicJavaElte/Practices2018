import models.City;
import models.AirportTrip;
import models.TrainTrip;
public class MyTripPlanner{

  public static void printIfWorthsTrain(AirportTrip airport, TrainTrip train){
    if (!airport.sameTrip(train)){
      System.out.println("invalid trip");
    }else
    if(airport.averageTime()+2<train.averageTime()){
      System.out.println("She will prefer the train");
    }else
    if(train.getMaximunClass()=='A'){
      System.out.println("She will prefer the train");
    }else
    System.out.println("She will plefer the plane");

  }


  public static void main (String args[]){
    City budapest = new City("budapest");
    City debrecen = new City("debrecen");
    City barcelona = new City("barcelona");

    TrainTrip trBPDB = new TrainTrip(50.5, 100, budapest, debrecen, "Keleti", 'A');
    AirportTrip aiBPDB = new AirportTrip(200, 100, budapest, debrecen, "Liszt Ferenc", 20);

    printIfWorthsTrain(aiBPDB,trBPDB);

  }
}
