
/*
	What's up?

	This is our first application, cool hunh...
	All the information we are discussing here is available at: https://docs.oracle.com/javase/tutorial/getStarted/application/
	Never miss the chance of taking a look in this official documentation, they have EVERYTHING there

	It is a bit messy and complicated I KNOW, but as soon as we get used to that is better. Is not so bad after a while, trust me :)

*/

/*
	YEAH, we start by declaring A CLASS, we gonna call it "Hello World".
	Since it needs to be callable, it is gonna be public.

	(When would you create a private class? You shouldn't bothet about it, but you can check it here: https://docs.oracle.com/javase/tutorial/java/javaOO/innerclasses.html)
*/
public class HelloWorld
{

	/*
		Here we are calling the main method, every single application in Java needs that
		it is basically the sign of where our software starts and the "main" lines of code.
		The compiler will be like, what can we do today? And then start checking from here,

		[From the documentation]
			The modifiers public and static can be written in either order (public static or static public),
			but the convention is to use public static as shown above. You can name the argument anything you want,
			but most programmers choose "args" or "argv".

			The main method accepts a single argument: an array of elements of type String.
		[/From the documentation]
	*/
	public static void main(String[] args) {

		/*
			What we want here? You're right! To simply print HelloWorld in the console.
			For using it, we need to call the print function which is in the System.out class

			You can use wither "print" or "println", the difference is that println adds a new line after printing.
			The arguments of the class are a simple String			
 		*/
		System.out.println("Hello world");

	}
}
