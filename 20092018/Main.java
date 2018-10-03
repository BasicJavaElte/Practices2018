class Main {
  public static long fib(int input){
	  if(input <= 1 && input >= 0){
		  return input;
	  }
	  else if(input < 0) {
		  return (-1) * (fib(input + 1) - fib(input + 2));
	  }
	  else{
		return fib(input - 1) + fib(input - 2);
	  }
  }

  public static void main(String[] args) {
		System.out.println("List of first 20 negative Fibonacci numbers:\nindex\tresult\n");
		for(int i=-20; i<0; i++){
			System.out.println(i + 1 + "\t" + fib(i + 1));
		}  

		System.out.println("\nList of first 20 positive Fibonacci numbers:\nindex\tresult\n");
		for(int i=0; i<20; i++){
			System.out.println(i + 1 + "\t" + fib(i + 1));
		}  
	}
}
