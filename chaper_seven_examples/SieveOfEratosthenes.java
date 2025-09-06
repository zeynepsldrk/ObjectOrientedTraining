import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        soe.countNumberOfPrimeNumber(n);
    }

    private void countNumberOfPrimeNumber(int n) {
        long start = System.currentTimeMillis();
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);
        list[0] = false;
        list[1] = false;

        int upperBound = (int) (Math.sqrt(n) + 1);

        for (int i = 2; i <= upperBound; i++) {
            if (list[i] == true)
                for (int j = 2; i * j <= n ; j++)
                    list[i * j] = false;
        }
        int numberOfPrime = 0;
        for (boolean b : list)
        {
            if (b)
                numberOfPrime++;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("There are " + numberOfPrime + " prime numbers up to " + n);
        System.out.println(time);
    }
}


