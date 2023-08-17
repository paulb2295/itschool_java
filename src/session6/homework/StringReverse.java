package session6.homework;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the string you want to reverse:");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        costumReverseFunction(stringBuilder);
        System.out.println(stringBuilder.reverse());
        scanner.close();
    }

    public static void costumReverseFunction(StringBuilder stringBuilder) {
        int midIndex = stringBuilder.length() / 2;
        int highIdex = stringBuilder.length() - 1;
        for (int lowIndex = 0; lowIndex < midIndex; lowIndex++) {
            char highChar = stringBuilder.charAt(lowIndex);
            char lowChar = stringBuilder.charAt(highIdex);
            stringBuilder.replace(highIdex, highIdex + 1, Character.toString(highChar));
            stringBuilder.replace(lowIndex, lowIndex + 1, Character.toString(lowChar));
            highIdex--;
        }
        System.out.println(stringBuilder.toString());
    }
}
