package session6.homework;

import java.util.Scanner;

public class CamelCaseToSnakeCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a Camel Case name:");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        camelToSnake(stringBuilder);
    }

    public static void camelToSnake(StringBuilder stringBuilder) {
        stringBuilder.replace(0, 1, Character.toString(stringBuilder.charAt(0)).toLowerCase());
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (index > 0 && Character.isUpperCase(stringBuilder.charAt(index))) {
                stringBuilder.replace(index, index + 1, Character.toString(stringBuilder.charAt(index)).toLowerCase());
                stringBuilder.insert(index, "_");
            }
        }
        System.out.println(stringBuilder);
    }
}
