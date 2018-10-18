public class Fibonacci {
    public static void main(String args[]) {
        System.out.println("Fibonacci numbers:");
        long f1 = 1, f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
        for(int i = 3; i <= 50; ++i) {
            f2 = f2 + f1;
            f1 = f2 - f1;
            System.out.println(f2);
        }
    }
}
