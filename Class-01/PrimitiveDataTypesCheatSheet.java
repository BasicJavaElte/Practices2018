/*
  The Java programming language is statically-typed, which means that all
  variables must first be declared before they can be used. This involves
  stating the variable's type and name.
*/
public class PrimitiveDataTypesCheatSheet{

  public static void main(String[] args) {

        /*
          By default, the int data type is a 32-bit signed two's complement integer,
          which has a minimum value of -231 and a maximum value of 231-1.
          In Java SE 8 and later, you can use the int data type to represent an
          unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1
        */
        int StudentsInTheClasroom;

        /*
          Use this data type when you need a range of values wider than those provided by int.
          The Long class also contains methods like compareUnsigned, divideUnsigned etc to support
          arithmetic operations for unsigned long.
        */
        long twoRaisedToMoreThanThirty;

        /*
          As with the recommendations for byte and short, use a float (instead of double)
          if you need to save memory in large arrays of floating point numbers.
          This data type should never be used for precise values, such as currency
        */
        float temperature;

        /*
          For decimal values, this data type is generally the default choice.
          As mentioned above, this data type should never be used for precise values, such as currency.
        */
        double pi;

        /*
          The boolean data type has only two possible values: true and false.
          Use this data type for simple flags that track true/false conditions.
          This data type represents one bit of information, but its "size" isn't something that's precisely defined.
        */
        boolean pregnant = 1;

        /*
          he char data type is a single 16-bit Unicode character.
          It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
        */
        char gender = 'F';



  }

}
