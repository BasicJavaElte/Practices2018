# Classes and Objects Class

**[LECTURE MATERIAL](http://kitlei.web.elte.hu/segedanyagok/foliak/java/en-java-bsc/02object-orientation.pdf)**

## We will cover today

* Packages
* The java.util Packages
* Exceptions handling (Try Catch)
* Create a time calculator class


## Today's problem
![Emmet Brown](https://carboncostume.com/wordpress/wp-content/uploads/2013/03/docbrown.jpg)

Dr. Emmett Brown is having some problems with his time machine, it was developed totally in Java (did you guys know it?), and now the problem is that he used only Strings to manage dates on his code and it is a mess.

The time machine works in such a way that you should always insert the current date and the other date in order to define where you want to travel in time. Good thing is that everything is working fine except from the DateItinerary class.

So in order to save the legacy of this time machine, you are requested to re-build this class using java.util.date package.

It should be instantiated in the following ways:

    // Constructor with Strings
    new DateItinerary("20171001", "19900201");

    // Empty Constructor
    new DateItinerary();

    // Constructor with dates
    new DateItinerary(current, goal);

It should have the following methods:

    // Getters and setters

    boolean isInTheFuture()

    boolean isInThePast()

    String toString()

### Constraints

Exceptions should be handled

The dates represented on strings are on the following format:

(Year(four digits)/month(two digits)/day(two digits))

For the same of simplicity we will cover only common era trips.

If the dates are the same, they are not future either past

The toString method should print From [date] to [date] and say the direction. For example "From 1991/01/01 to 2017/12/17, we are going to the future"


## Documentation regarding the examples:
* [Java Util Date](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)
