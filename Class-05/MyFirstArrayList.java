import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import models.Person;
import models.Classroom;


public class MyFirstArrayList{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat myFormat= new SimpleDateFormat("yyyyMMdd");
		String userCommand;

		Classroom classroom = new Classroom();

		do{
			System.out.println("Say 'exit' 'add', 'remove' or 'list' ");
			userCommand = scanner.next();

			switch(userCommand){
				case "add":

					System.out.println("Say the name of the Person");
					String name = scanner.next();

					System.out.println("Say the birthday of the Person(YYYYMMDD)");
					Date day = new Date();

					boolean validDate = false;
					while(!validDate){
						try{
							day = myFormat.parse(scanner.next());
							validDate = true;
						}catch(ParseException e){
							System.out.println("Invalid date, type it again");
							validDate = false;
						}
					}

					Person p = new Person(name, day);
					classroom.addStudent(p);
					System.out.println("My classrooom has "+classroom.howManyStudents());
					break;
				case "remove":
					System.out.println("Who you want to remove");
					String studentName = scanner.next();
					if(classroom.removeStudent(studentName)){
						System.out.println("Adios");
						System.out.println("My classrooom has "+classroom.howManyStudents());
					}else{
						System.out.println("Student not removed");
					}
					break;
				case "list":
					classroom.sort();
					classroom.printAll();
					break;

			}
			
		}while(!userCommand.equals("exit"));

	}

}
