package session3.homework;

import java.util.Scanner;

public class RelationalOperators1 {

    public static void main(String[] args) {

        double firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        String userInput = scanner.nextLine();
        firstNumber = Double.parseDouble(userInput);

        System.out.println("Please provide the second number: ");
        userInput = scanner.nextLine();
        secondNumber = Double.parseDouble(userInput);

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " = " + secondNumber);
        } else {
            System.out.println(firstNumber + " < " + secondNumber);
        }
    }
}
