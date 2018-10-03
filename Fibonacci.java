public class Fibonacci {
	
	public static void main( String args[]){
		
		int i, n1 =0;
		int n2 = 1, n3;
		System.out.println("line : 0");
		System.out.println(n1);
		System.out.println("line : 1");
		System.out.println(n2);
		
		for(i=0; i<10; i++){
			n3 = n1 + n2;
			System.out.println("line : " + (i+2) );
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
}
