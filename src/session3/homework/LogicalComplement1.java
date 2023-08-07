package session3.homework;

import java.util.Scanner;

public class LogicalComplement1 {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number: ");
        String userInput = scanner.nextLine();
        number = Integer.parseInt(userInput);

        if (!(number > 0)) {
            System.out.println("Negative number!");
        } else {
            System.out.println("Positive number!");
        }
    }
}
