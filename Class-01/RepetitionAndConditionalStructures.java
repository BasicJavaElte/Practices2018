/*
  The Java programming language is statically-typed, which means that all
  variables must first be declared before they can be used. This involves
  stating the variable's type and name.
*/
public class RepetitionAndConditionalStructures{

  public static void main(String[] args) {
      /*
        Here we have a situation where Mary and John have different number of oranges each
        We would like thme to have always the same amount so we will create a while funcion for such
        Nope, this is not the best way to do it, all we want is to learn the while structure
      */

      // Let's degine the initial amount of oranges
      int johnOranges = 3;
      int maryOranges = 10;

      // For now, WHILE john HAS LESS oranges than Mary, we give one more orange to John
      while (johnOranges<maryOranges){
        // This funny instruction adds +1 to the integer, you can use the same with -- (minus)
        johnOranges++;

        /*
          NEW: yeap, this format thing is new for us.
          Read more about the format: https://docs.oracle.com/javase/tutorial/essential/io/formatting.html
        */

        //System.out.print("Now John has "+johnOranges+" oranges and Mary has "+maryOranges+" \n");
        System.out.println("Now John has "+johnOranges+" oranges and Mary has "+maryOranges);
      }

      /*
          TODO:TODO TODO TODO TODO TODO TODO TODO
            We are not sure if the problem is Mary or John having more oranges,
            create a new while structure to avoid any injustice with Mary
          TODO:TODO TODO TODO TODO TODO TODO TODO
      */

      /*
        What about printing all the square roots of the numbers from 0 to 15?
      */
      // for an integer variable i, which starts equal zero, while it is lower than 15, add one
      // for (initialization; termination; increment);
      for(int i=0; i<15; i++){
        double r = Math.sqrt(i);

        //System.out.println("The square root of "+i+" is "+r);
      }

      /*
        TODO:TODO TODO TODO TODO TODO TODO TODO
          Let's show that we can do it, and print all the square rise of the EVEN numbers
        TODO:TODO TODO TODO TODO TODO TODO TODO
      */

  }

}
