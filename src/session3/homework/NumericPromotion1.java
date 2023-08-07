package session3.homework;

import java.util.Scanner;

public class NumericPromotion1 {

    public static void main(String[] args) {
        int intNumber;
        double doubleNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the Double number: ");
        String userInput = scanner.nextLine();
        doubleNumber = Double.parseDouble(userInput);

        System.out.println("Please provide the Integer number: ");
        userInput = scanner.nextLine();
        intNumber = Integer.parseInt(userInput);

        System.out.println("intNumber + doubleNumber = " + (intNumber + doubleNumber));
        System.out.println("intNumber - doubleNumber = " + (intNumber - doubleNumber));
        System.out.println("intNumber * doubleNumber = " + (intNumber * doubleNumber));
        System.out.println("intNumber / doubleNumber = " + (intNumber / doubleNumber));
        System.out.println("intNumber % (int)doubleNumber = " + (intNumber % (int) doubleNumber));
        System.out.println("intNumber % doubleNumber = " + (intNumber % doubleNumber));
        System.out.println("doubleNumber % intNumber = " + (doubleNumber % intNumber));
    }
}
