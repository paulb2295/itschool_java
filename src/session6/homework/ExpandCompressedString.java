package session6.homework;

import java.util.Scanner;

public class ExpandCompressedString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string for case toggling");
        String string = new String(scanner.nextLine());
        stringExpander(string);
    }

    public static void stringExpander(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 1; index < string.length(); index++) {
            switch (string.charAt(index)) {
                case '1', '2', '3', '4', '5', '6', '7', '8', '9': {
                    for (int subIndex = 0; subIndex < Integer.parseInt(Character.toString(string.charAt(index))); subIndex++) {
                        stringBuilder.append(string.charAt(index - 1));
                    }
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
