# Final Assignment - First phase (Updated in Oct 24th)

![Willy Wonka](https://scera.org/wp-content/uploads/2017/03/willy_wonka_wallpaper.jpg)



Willy Wonka got to the 21st century and decided to run again his factory, once again he will
run an invitation for five lucky kids to join him.

You are requested to build up the system which will manage the kids registration, products manufacturing and of Course, the Oompa Loompas.

The software shall implement the following items:

* 1 - Register Prize tickets
* 2 - List all prize tickets
* 3 - List only raffled tickets
* 4 - Create a new Oompa Loompa song
* 5 - Register Beings
* 6 - Register Products
* 7 - Ruffle tickets
* 8 - Register sale
* 9 - List winners


The class **GoldenTicket** should have the following methods:

    // public class GoldenTicket

    //Constructors:
    new GoldenTicket();
    new GoldenTicket(String code, Date raffled)

    // Getters and Setters

    // If the current ticket has been already raffled
    boolean isRaffled()

The class **OompaLoompaSong** should be initialized with an ArrayList of each line of an OompaLoompa song (example available in OompaLoompaSong.txt) and should implement the following methods:

    // public class OompaLoompaSong

    //Constructors:
    // define how many lines  the song shall have
    new OompaLoompaSong(int lines);        

    // Return a String with the song
    String sing()

The song should Return the lines randomly selected.

You are free to create other methods that are not listed above and may help your development. ( cof cof toString cof cof equals )

### Beings registration

All beings that enter the factory must be registered, but, *nobody should be registered as a generic being* but as one of the following:

* Kid (code, birthday, name, list of purchased products, place of birth)
* OompaLoompa (code, name, height, favorite food (can be a String))

You are responsible for the typing of the attributes. All beings have a unique code from which they are referenced (when shopping for instance).

### Product registration
All the products should be registered with the attributes:
  * description (String)
  * barcode (long)
  * serialNumber (String)
  * prizeTicket (GoldenTicket)

If the Prize Ticket has a GoldenTicket it means that the product has a prize, otherwise it should be null

These should be registered in a list (or file).

### Register sale
  This item shall ask for the user code and the product barcode (you can make it as simple as 123), then it randomly take one product from that barcode and adds it to the kids products list and removes it from the general list of products.

### Ruffle tickets
  Given a number of tickets to be ruffled, it creates the GoldenTickets (giving a random code and the current date) and ruffles it on the list of products.

  The system asks how many GoldenTickets should be created and then ruffles the Golden Tickets into the list of products.

### List winners
  This goes through all the registered kids and check if they have bought any product with GoldenTicket in it, if that's the case, it prints out the name of the kid


## Libraries
  The following but not restricted to:
  * Use Java.text.SimpleDateFormat for the dates formatting and parsing (if necessary)
  * Use some library for creating the random Oompa Loompa song





## Scoring
For this assignment we will use a different approach for grading that will work as explained bellow:

* You shall implement all the given assignment, if the system is fairly running and working, you will get 2 points;

* The other 3 points will be given by practices that are expected in the assignment, those, will be revealed only after the deadline; (E.G.: if the student created the attribute name as a String he gets 0.2 points, if the classes are not declared with capital case students will loose 0,5 points, if a certain class is an abstract class the student gets 1 point)
  * The students will have the right of arguing the given document on the 36 hours following the document release, these, should be sent by e-mail (ferrari at caesar you know...) with appropriate justification based in the official documentation, academic publications or relevant pages (Stackoverflow, Wikipedia etc do not count);
    * The arguments should be based in the rules already written and given, i.e. no new grade rules should be created
    * The lecturer will evaluate the requests and add the approved ones to the evaluation guide which will be applied for ALL STUDENTS.
    * There is no reconsideration of the lecturer decisions (i.e. send a convincing request on the first place)

* Notice that the list of random checks is also a very good plagiarism detector. So again, copying someone's work and just changing indentation and variables names will not help you and may affect both of you.

* **IMPORTANT:** Assignments which are sent after the evaluation guide is published will get AT MOST 2 (PASS) grade.

* **THERE IS NO RETAKE OF THIS ASSIGNMENT**

## Recommendations:
  * if for instance the number of tickets is bigger than the number of products, it is okay to simply add the tickets to the products and inform the user, you don't need to ask the user to inform another number (unless you want);
  * You can create a class on a separated file to populate the Arrays (it will be less messy for your Main).

### Extra Points
  * Delivering on GitHub (public or private repo), sending the link via canvas. (+10%)
  * Writing on files the users (+20% for working alone students, +10% for students working in pairs)

## Rules
  * Individual Assignment:
    * Can store all the variables into Java.util.ArrayList
  * Two people Assignment:
    * Shall store the data into text files
  * Code and package organization counts, unorganized code or code from IDEs will be ignored;
  * Except from the Java default libraries, all the sent code MUST BE YOURS, plagiarism will be graded with zero and may be subject of sanctions given by ELTE regulations;
  * Copied assignment gives zero score for both (except GitHub),take care of your source code;
  * In case of copy of a GitHub public repository, the date of the commit will be considered, the latest commit will be considered plagiarism;
  * Github delivered assignments will have the code considered until the last commit prior the deadline. (in case of none, the mark will take in consideration late assignment rules);
  * Do not send anything else then folders and .java files;
  * Instructions for sending will be available on the Canvas assignment;
  * Assignments containing IDE imports or IDE projects will not be considered.
  ***Rules added on Nov 11th:***
  * The assignment should implement: ( at least one static method) AND (at least one inheritance) AND (at least one interface or at least one abstract class);
      * Please, notice that the usage of those must make sense from the theoretical point of view.
  * **Pre-populate the software with all needed registers to make it run**

## Consultation
  * The consultations will be only face to face and should be booked in advance via e-mail, where the student should also pre-send the code;
  * On the consultation the lecturer will go through the working code and give verbal and written feedback (via e-mail) to the student(s);
  * No pre-grade will be given on the consultation;
  * Consultation depends on time availability, last minute requests cannot be guaranteed.


## DATES
  * Last day to book consultation is 10th of January
  * Last day for consultations 11th of January;
  * Last day for submitting the Assignment 20th of January 23:59:00 Central European Time;
  * Last day for submitting requests regarding the grading: 36 hours after the publication on GitHub.


  ## Updates:
  * Oct 24th: Added prize tickets, Menu creation and Oompa Loompa song to the tasks
  * Nov 11th: Added beings registration, added products registration,  Ruffle tickets, Register shop.
  * Nov 11th: Extended feedback frame, added explanation of the scoring.
  * Nov 26th: Eddited the name of the menu item from "Register shop" to "Register sale"
