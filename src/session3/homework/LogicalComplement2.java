package session3.homework;

import java.util.Scanner;

public class LogicalComplement2 {

    public static void main(String[] args) {

        boolean goodFood, expensiveFood;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the food tasty? ");
        String userInput = scanner.nextLine();
        goodFood = Boolean.parseBoolean(userInput);

        System.out.println("Is the food expensive? ");
        userInput = scanner.nextLine();
        expensiveFood = Boolean.parseBoolean(userInput);

        goodFood = !goodFood;
        expensiveFood = !expensiveFood;

        System.out.println("Is the food tasty? " + goodFood);
        System.out.println("Is the food expensive? " + expensiveFood);
    }
}
