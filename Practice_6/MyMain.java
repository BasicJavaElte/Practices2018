import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {
    public static void main(String args[]) throws Exception {
        ArrayList<String> mass = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Choose \n 1-add \n 2 - list \n 3 - clear \n 4 -exit");
            option = sc.nextInt();
            switch (option){
                case 1: {
                    System.out.println("Say something, I am giving up on you...");
                    mass.add(sc.next());
                    System.out.println("Now we have " + mass.size() + " elements \n");
                    break;
                }
                case 2: {
                    for (int i = 0; i < mass.size(); i++) {
                        System.out.println(mass.get(i));
                    }
                    break;
                }
                case 3: {
                    mass.clear();
                    System.out.println("Now we have " + mass.size() + " elements \n Cleaned successfully!");
                    break;
                }
                default:
                    break;
            }

        } while (option != 4);

    }
}