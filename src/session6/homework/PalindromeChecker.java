package session6.homework;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the string for palindrome checker:");
        String input = scanner.nextLine();
        palindromeChecker(input);
    }

    public static void palindromeChecker(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        if (string.equalsIgnoreCase(stringBuilder.toString())) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
