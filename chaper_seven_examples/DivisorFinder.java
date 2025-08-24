import java.util.Scanner;

public class DivisorFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number sir:]");
        int a = input.nextInt();
        int i = 1;
        System.out.print(a + " divisor of number:");
        while (a >= i) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
