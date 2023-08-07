package session3.homework;

import java.util.Scanner;

public class BinaryArithmeticOperators2 {

    public static void main(String[] args) {

        double lenght, breadth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the lenght of the rectangle: ");
        String userInput = scanner.nextLine();
        lenght = Double.parseDouble(userInput);

        System.out.println("Please provide the breadth of the rectangle: ");
        userInput = scanner.nextLine();
        breadth = Double.parseDouble(userInput);

        System.out.println("The aria of the rectangle is: " + (breadth * lenght));
    }
}
