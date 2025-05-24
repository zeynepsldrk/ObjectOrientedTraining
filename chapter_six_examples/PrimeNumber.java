import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int upperBound = (int) Math.sqrt(number) + 1; // number diyelim ki 144
        // eğer 144 ün karekökünden bir fazlasına kadar olan sayılara 144 bölünemiyorsa
        // ondan sonraki sayılara da bölünemez.
        for (int i = 2; i < upperBound; i++) {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number + " is prime.");
        }
        else {
            System.out.println(number + " is not prime.");
        }
    }
}
