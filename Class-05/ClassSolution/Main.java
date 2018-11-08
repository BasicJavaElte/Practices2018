import java.util.Scanner;

public class Main{
	
	public static void main (String args []){		
		int option = 0;
		Controller c = new Controller();
		Scanner scanner = new Scanner(System.in);
		do{
			
			System.out.println("Select from list: "
				+"\n 1- Add \n 2- Remove: \n 3- Sorted List"
				+"\n 0- exit" );
			option = scanner.nextInt();
			
			switch(option){
				case 1:
					c.addStudent();
					break;
					
				case 2:
					c.removeStudent();
					break;
					
				case 3:	
					c.listStudents();
					break;	
					
				case 0:				
					break;
					
				default:
					System.out.println("wrong option");
			}
			
		}while(option != 0);
		
	}
}