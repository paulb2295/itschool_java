package session6.homework;

import java.util.Scanner;

public class DuplicateCharRemover {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a sentence:");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        doubleRemover(text);

    }


    public static void doubleRemover(StringBuilder stringBuilder) {
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (index + 1 < stringBuilder.length() && stringBuilder.charAt(index) == stringBuilder.charAt(index + 1)) {
                stringBuilder.deleteCharAt(index + 1);
            }
        }
        System.out.println(stringBuilder);
    }
}
