package session6.homework;

import java.util.Scanner;

public class BalancedParenthesesChecker {

    public static void main(String[] args) {

        System.out.println("The inserted string is balanced:" + parenthesesChecker());
    }

    public static boolean parenthesesChecker() {
        System.out.println("Insert the string you want to check:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        scanner.close();
        int roundStart = 0;
        int boxStart = 0;
        int curlyStart = 0;
        int roundEnd = 0;
        int boxEnd = 0;
        int curlyEnd = 0;
        for (int index = 0; index < stringBuilder.length(); index++) {
            switch (stringBuilder.charAt(index)) {
                case '(' -> roundStart++;
                case '[' -> boxStart++;
                case '{' -> curlyStart++;
                case ')' -> roundEnd++;
                case ']' -> boxEnd++;
                case '}' -> curlyEnd++;
            }
        }
        if (roundStart == roundEnd && boxStart == boxEnd && curlyStart == curlyEnd) {
            return true;
        } else {
            return false;
        }
    }
}
