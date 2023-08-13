package session5.homework;

import java.util.Scanner;

public class WhileLoopAdder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;

        while (input != -1) {
            System.out.println("Next number to add | -1 to quit:");
            input = scanner.nextInt();
            if (input != -1) {
                sum += input;
            }
        }
        System.out.println("The sum of the added numbers is:" + sum);
    }
}
