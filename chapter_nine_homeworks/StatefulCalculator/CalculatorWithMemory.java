package StatefulCalculator;

import java.util.Random;
import java.util.Scanner;

public class CalculatorWithMemory {
    public static void main(String[] args) {

        Random r = new Random();
        int firstNumber;
        int secondNumber;

        char[] operators = {'+', '-', '/', '*'};
        int randomIndex;
        char choosenOperator;

        System.out.println("Enter a number that you record experience: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double[] array = new double[n];

        StatefulCalculator calc = new StatefulCalculator();

        for (int i = 0; i < n; i++)
        {
            firstNumber = r.nextInt(100) + 1;
            secondNumber = r.nextInt(100) + 1;
            randomIndex = r.nextInt(operators.length);
            choosenOperator = operators[randomIndex];

            calc.setFirstArgument(firstNumber);
            calc.setSecondArgument(secondNumber);
            calc.setOperation(choosenOperator);
            array[i] = calc.getResult();
            System.out.println("Result " + i + ": " + array[i]);
            System.out.println(calc.getFirstArgument() + " " + calc.getOperation() + " " + calc.getSecondArgument() + " = " + array[i]);
        }

    }
}
