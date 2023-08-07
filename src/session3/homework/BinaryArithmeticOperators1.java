package session3.homework;

import java.util.Scanner;

public class BinaryArithmeticOperators1 {

    public static void main(String[] args) {

        double firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        String userInput = scanner.nextLine();
        firstNumber = Double.parseDouble(userInput);

        System.out.println("Please provide the second number: ");
        userInput = scanner.nextLine();
        secondNumber = Double.parseDouble(userInput);

        System.out.println("firstNumber + secondNumber = " + (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber = " + (firstNumber - secondNumber));
        System.out.println("firstNumber * secondNumber = " + (firstNumber * secondNumber));
        System.out.println("firstNumber / secondNumber = " + (firstNumber / secondNumber));
        System.out.println("firstNumber % secondNumber = " + ((int) firstNumber % (int) secondNumber));
    }
}
