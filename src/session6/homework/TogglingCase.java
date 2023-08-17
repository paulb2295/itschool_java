package session6.homework;

import java.util.Scanner;

public class TogglingCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string for case toggling");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        caseToggle(stringBuilder);
        System.out.println(stringBuilder);
    }

    public static void caseToggle(StringBuilder stringBuilder) {
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (Character.isUpperCase(stringBuilder.charAt(index))) {
                stringBuilder.replace(index, index + 1, Character.toString(stringBuilder.charAt(index)).toLowerCase());
            } else if (Character.isLowerCase(stringBuilder.charAt(index))) {
                stringBuilder.replace(index, index + 1, Character.toString(stringBuilder.charAt(index)).toUpperCase());
            }
        }
    }
}
