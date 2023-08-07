package session3.homework;

import java.util.Scanner;

public class IncrementDecrementOperators2 {

    public static void main(String[] args) {

        int number, counter = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the number: ");
        String userInput = scanner.nextLine();
        number = Integer.parseInt(userInput);

        while (counter >= 0) {
            number += 1;
            counter--;
            System.out.println(number);
        }
        while (counter <= 5) {
            number -= 1;
            counter++;
            System.out.println(number);
        }

    }
}
