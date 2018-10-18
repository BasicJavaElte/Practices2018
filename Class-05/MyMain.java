import java.util.ArrayList;
import java.util.Scanner;

// Create a menu asking for add or list
// We should add infinite many Strings or list them
// The strings should be added to an ArrayList


public class MyMain{
	
	public static void main(String args[]) throws Exception{
		ArrayList<String> myStrings = new ArrayList<String>();
		Scanner scanner = new Scanner (System.in);
		
		
		int option=0;
		do{
			System.out.println("Choose \n 1-add \n 2-List \n 3-Clean \n 4-Exit");
			option = scanner.nextInt();
			
			if(option==1){
				System.out.println("So please say a word");
				
				myStrings.add(scanner.next());
				
				System.out.println("now we have "+myStrings.size()+" Strings");
			}
			if(option==2){
				// list all the words here
			}
			if(option==3){
				// Clean the list here
			}
			
		}while(option!=3);
			
	}
	
}