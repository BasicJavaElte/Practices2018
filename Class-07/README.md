## We will cover today

* Abstract class and methods
* Re-build class 4 examples using inheritance

## Points of discussion
* Isn't it easy to simply only create normal Classes and forget all about this thing of Abstract and Interface thing?
* Will an Abstract Class have a constructor?




## Let's play is it Abstract Class or Interface
[(FROM THE Java Tutorials)](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
* **Consider using abstract classes if any of these statements apply to your situation**:
  * You want to share code among several closely related classes.
  * You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
  * You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
* **Consider using interfaces if any of these statements apply to your situation**:
  * You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
  * You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
  * You want to take advantage of multiple inheritance of type.

## Today's problem

  Judit is a Hungarian lady who likes to travel around Europe, she uses three main ways of transportation, Bus, Train and Airplanes.

  Your duty today is to create a comparator of transportation means for Judit,

  Since all the public transportation are the same and Judit attended the Java Classes, she already created a class TravelTwoCities, so you don't need to bother with that.

  Let's start creating two classes who will inherit the abstract class created by Judit.
  The **public class TrainTrip**, which has the name of the station and the maximum carriage class for that trip, AND, the **public class AirportTrip**, which has the distance to the airport and the name of the airport.

  Judit has some money and loves to travel in the train first class sometimes,
  Create also a method (in your main) to print out which trip Judit would prefer following the rules:

  * If a trip by train is less than three hours difference from the trip by plane, she rather take the train;
  * If the trip is more than three hours but the train has class A carriage, she'd rather take the train;
  * If none of the above happens, she prefers to take the plane.

  Judit missed Class 06 and would like to know if this is a good case for creating an Abstract Class. Take a look into the example and check if this is applicable.

## Cool links

[Abstract Methods and Classes (From Oracle)] (https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
