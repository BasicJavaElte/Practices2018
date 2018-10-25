import java.util.Scanner;
import java.util.ArrayList;

public class MyFirstMenu{
	
	public static ArrayList<String> words =
				new ArrayList<String>();
	
	static Scanner scanner = new Scanner(System.in);		
	
	public static void sayHi (){
		System.out.println("hi");
	}
	
	public static void sayBye(){
		System.out.println("bye");
	}
	
	public static void addWord(){
		System.out.println("say the word");
		String word = scanner.next();
		words.add(word);
		System.out.println("Word "+word+" has been added");
	}
	
	public static void listWords(){
		for(int i=0; i<words.size();i++){
			System.out.println(words.get(i));
			//Person p = people.get(i);
		}
	}
	
	
	public static void main (String args []){
		/* 
			Select from list:
			1- Say hi
			2- Say bye	
			3- Add word
			4- List words
		
		*/
		
		
		int option = 0;
		
		do{
			
			System.out.println("Select from list: "
				+"\n 1- Say hi \n 2- Say bye: \n 3- add word"
				+"\n 4- list words \n 0- exit" );
			option = scanner.nextInt();
			
			switch(option){
				case 1:
					sayHi();
					break;
				case 2:
					sayBye();	
					break;
				case 3:
					addWord();	
					break;
				case 4:
					listWords();	
					break;
				case 0:				
					break;
				default:
					System.out.println("wrong option");
			}
			
		}while(option!=0);
		
	}
}