package session5.homework;

import java.util.Scanner;

public class SumOfNumberGreaterThanFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        for (int index = 1; index <= 10; index++) {
            System.out.println("Enter a number for addition:");
            number = scanner.nextInt();
            if (number <= 5) {
                continue;
            } else {
                sum += number;
            }
        }
        System.out.println("The sum of the numbers greater than 5 is: " + sum);
        scanner.close();
    }
}
