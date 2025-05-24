import java.util.Scanner;

public class MonteCarloPi {
    public static void main(String[] args) {
        System.out.println("Enter a number of points");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberInCircule = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = x*x + y*y ;
            if (distance <= 1) {
                numberInCircule++;
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;

        double myPI = 4.0 * numberInCircule / n;
        System.out.println("My pi: " + myPI);
        System.out.println("Java's pi: " + Math.PI);
        System.out.println("Time: " + time + "ms.");
    }
}
