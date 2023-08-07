package session3.homework;

import java.util.Scanner;

public class UnaryOperators2 {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number: ");
        String userInput = scanner.nextLine();
        number = Integer.parseInt(userInput);
        number = -number;
        System.out.println("Reversed sign number: " + number);
    }
}
