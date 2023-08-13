package session5.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter a number between 1 and 10:");
            input = scanner.nextInt();
            if (input == randomNumber) {
                System.out.println("Congratulations, you guessed the number!");
            } else if (input < 1 || input > 10) {
                System.out.println("Number out of range!");
            } else {
                System.out.println("Try again!");
            }
        } while (input != randomNumber);

    }
}
