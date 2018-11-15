import models.Student;
import models.Person;

public class Test{
	
	public static void main (String args[]){
		
		Person p = new Person("Josh","Smith"); 
		
		Student student = new Student("Mario","Broz","npt123","FHGD454" );
		System.out.println(student);
		
	}
}