public class Fibonacci{
	public static void main(String args[]){
	int n=1;
	int m=1;
	System.out.print(n + " " + m + " ");
	for(int i=0; i<10; i++){
		int k = m + n;
		n = m;
		m = k;
		System.out.print(k + " ");
	}
	System.out.println();
	}
}