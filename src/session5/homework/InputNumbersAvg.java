package session5.homework;

import java.util.Scanner;

public class InputNumbersAvg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int numberCount = 0;
        double average = 0;

        while (true) {
            System.out.println("Insert a number for mean calculation | Insert 0 to stop");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            numberCount++;
            average = (double) sum / numberCount;
        }
        System.out.println("The mean of the inserted numbers is " + average);
        scanner.close();
    }
}
