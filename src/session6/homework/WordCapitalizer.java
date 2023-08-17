package session6.homework;

import java.util.Scanner;

public class WordCapitalizer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the sentence to capitalize letters");
        String string = scanner.nextLine();
        wordCapitalizer(string);
    }

    public static void wordCapitalizer(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.replace(0, 1, stringBuilder.substring(0, 1).toUpperCase());
        for (int index = 1; index < stringBuilder.length() - 2; index++) {
            if (stringBuilder.charAt(index) == '.'
                    || stringBuilder.charAt(index) == '!'
                    || stringBuilder.charAt(index) == '?') {
                int letterIndex = spaceIgnorer(stringBuilder, index + 1);
                if (letterIndex + 1 < stringBuilder.length()) {
                    stringBuilder.replace(letterIndex, letterIndex + 1, stringBuilder.substring(letterIndex, letterIndex + 1).toUpperCase());
                }
            }
        }
        System.out.println(stringBuilder);
    }

    public static int spaceIgnorer(StringBuilder stringBuilder, int startIndex) {
        for (int index = startIndex; index < stringBuilder.length(); index++) {
            if (stringBuilder.charAt(index) != ' ') {
                return index;
            }
        }
        return 0;
    }
}
