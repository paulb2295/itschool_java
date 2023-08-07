package session3.homework;

import java.util.Scanner;

public class AsignmentAndCompoundAsignmentOperators2 {

    public static void main(String[] args) {

        double price, discount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the price: ");
        String userInput = scanner.nextLine();
        price = Double.parseDouble(userInput);

        System.out.println("Please provide the discount: ");
        userInput = scanner.nextLine();
        discount = Double.parseDouble(userInput);
        discount /= 100;
        price -= (discount * price);
        System.out.println("Price after discount: " + price);

    }
}
