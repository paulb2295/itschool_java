package session3.homework;

import java.util.Scanner;

public class RelationalOperators2 {

    public static void main(String[] args) {

        double number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number: ");
        String userInput = scanner.nextLine();
        number = Double.parseDouble(userInput);

        if ((number > 0) && (number < 101)) {
            System.out.println("Number inside specified range!");
        } else {
            System.out.println("Number OUTSIDE specified range");
        }
    }
}
