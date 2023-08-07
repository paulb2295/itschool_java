package session3.homework;

import java.util.Scanner;

public class AsignmentAndCompoundAsignmentOperators1 {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number: ");
        String userInput = scanner.nextLine();
        number = Integer.parseInt(userInput);

        System.out.println(number + " + 20 " + "= " + (number += 20));
        System.out.println(number + " - 20 " + "= " + (number -= 20));
        System.out.println(number + " * 20 " + "= " + (number *= 20));
        System.out.println(number + " / 20 " + "= " + (number /= 20));
    }
}
