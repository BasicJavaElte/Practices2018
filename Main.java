import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	//create a menu asking for add or list
	//add infinite strings or list them
	//Strings should be added to an ArrayList

	public static void main(String[] args) throws Exception{
		
		ArrayList<String> myString = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		try{
			int option = 0;
			do{
				System.out.println("Choose \n  1 - add\n  2 - list\n  3 - clean\n  4 - exit");
				option = sc.nextInt();
				switch(option){
					case 1:
						System.out.println("Write a string");
						myString.add(sc.next());
						System.out.println("Now we have " + myString.size() + " elements");
						break;
					case 2:
						if(myString.size() == 0){
							System.out.println("Array is empty");
						}
						else{
							for (int i = 0; i < myString.size(); i++){
							String str = myString.get(i);
							System.out.println(str);
							}
						}
						break;
					case 3:
						for (int i = 0; i < myString.size(); i = i){
							myString.remove(i);
						}
						break;
					case 4:
						System.out.println("Good bye");
						break;
					default:
						System.out.println("I wanna a number from 1 to 4!!!");
						break;
				}
			}while(option != 4);
		}
		catch(Exception e){
			System.out.println("You have to write a number from 1 to 4!!!");
			System.exit(-1);
		}
	}
} 