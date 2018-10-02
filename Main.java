import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ind = 50;
        boolean customInput = false;

        // Uncomment for custom input:
        // customInput = true;

        if (customInput) {
            Scanner in = new Scanner(System.in);
            ind = in.nextInt();
        }
        long n = 0;
        long m = 1;
        for (long i = 0; i < ind; i++) {
            System.out.print(m);

            if (i != ind - 1) {  //To eliminate empty line after last number:
                System.out.println();
            }

            long tmp = m + n;
            n = m;
            m = tmp;
        }
    }
}
