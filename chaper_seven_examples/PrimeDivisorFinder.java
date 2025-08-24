import java.util.Scanner;

public class PrimeDivisorFinder {
    public static boolean isPrime(int a)
    {
        int j = 1;
        int count = 0;
        while(a >= j)
        {
            if (a % j == 0)
                count++;
            j++;
        }
        if(count == 2)
            return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number sir:]");
        int a = input.nextInt();
        int i = 1;
        System.out.print(a + " prime divisor of number:");
        while (a >= i) {
            if (a % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            i++;
        }
    }
}
