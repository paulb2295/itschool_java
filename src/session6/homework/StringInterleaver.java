package session6.homework;

import java.util.Scanner;

public class StringInterleaver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first string:");
        StringBuilder textOne = new StringBuilder(scanner.nextLine());
        System.out.println("Insert the second string:");
        StringBuilder textTwo = new StringBuilder(scanner.nextLine());
        System.out.println("Result:");
        stringInterleaver(textOne, textTwo);

    }

    public static void stringInterleaver(StringBuilder text1, StringBuilder text2) {
        StringBuilder finalText = new StringBuilder();
        if (text1.length() > text2.length()) {
            int difference = text1.length() - text2.length();
            for (int index = difference; index < text1.length(); index++) {
                text2.append(" ");
            }
        } else if (text2.length() > text1.length()) {
            int difference = text2.length() - text1.length();
            for (int index = difference; index < text2.length(); index++) {
                text1.append(" ");
            }
        }
        for (int index = 0; index < text1.length(); index++) {
            finalText.append(text1.charAt(index));
            finalText.append(text2.charAt(index));
        }
        System.out.println(finalText);
    }
}
