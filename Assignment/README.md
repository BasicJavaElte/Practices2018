# Final Assignment - First phase (Updated in Oct 24th)

![Willy Wonka](https://scera.org/wp-content/uploads/2017/03/willy_wonka_wallpaper.jpg)

##Updates:
Oct 24th: Added prize tickets, Menu creation and Oompa Loompa song to the tasks

Willy Wonka got to the 21st century and decided to run again his factory, once again he will
run an invitation for five lucky kids to join him.

You are requested to build up the system which will manage the kids registration, products manufacturing and of Course, the Oompa Loompas.

The software shall implement the following items:

* 1 - Register Prize tickets
* 2 - List all prize tickets
* 3 - List only raffled tickets
* 4 - Create a new Oompa Loompa song


The class GoldenTicket should have the following methods:

    // public class GoldenTicket

    //Constructors:
    new GoldenTicket();
    new GoldenTicket(String code, Date raffled)

    // Getters and Setters

    // If the current ticket has been already raffled
    boolean isRaffled()

The class OompaLoompaSong should be initialized with an ArrayList of each line of an OompaLoompa song (example available in OompaLoompaSong.txt) and should implement the following methods:

    // public class OompaLoompaSong

    //Constructors:
    // define how many lines  the song shall have
    new OompaLoompaSong(int lines);        

    // Return a String with the song
    String sing()

The song should Return the number of lines randomly



You are free to create other methods that are not listed above and may help your development. ( cof cof toString cof cof equals )



## Libraries
  The following but not restricted to:
  * Use Java.text.SimpleDateFormat for the dates formatting and parsing (if necessary)
  * Use some library for creating the random Oompa Loompa song



## Scoring
[coming soon]

## Rules
  * Individual Assignment:
    * Can store all the variables into Java.util.ArrayList
  * Two people Assignment:
    * Shall store the data into text files
  * Code and package organization counts;
  * Except from the Java default libraries, all the sent code MUST BE YOURS, plagiarism will be graded with zero and may be subject of sanctions given by ELTE regulations;
  * Copied assignment gives zero score for both (except GitHub),take care of your source code;
  * In case of copy of a GitHub public repository, the date of the commit will be considered, the latest commit will be considered plagiarism;
  * Github delivered assignments will have the code considered until the last commit prior the deadline. (in case of none, the mark is zero);
  * Do not send anything else then folders and .java files;
  * You book consultation 2 days prior deadline to ask for feedbacks;
  * Instructions for sending will be available on the Canvas assignment;
  * Assignments containing IDE imports or IDE projects will not be considered.



## Extra Points
  * Delivering on GitHub (public or private repo), sending the link via canvas. (+10%)

## DATES
  [comming soon]
