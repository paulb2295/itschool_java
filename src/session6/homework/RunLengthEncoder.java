package session6.homework;

import java.util.Scanner;

public class RunLengthEncoder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the string you want to encode:");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        System.out.println("Encoded string:");
        runLengthEncoder(text);
    }

    public static void runLengthEncoder(StringBuilder stringBuilder) {
        StringBuilder encodedString = new StringBuilder();
        for (int index = 0; index < stringBuilder.length(); index++) {
            int count = 1;
            while (index < stringBuilder.length() - 1 && stringBuilder.charAt(index) == stringBuilder.charAt(index + 1)) {
                count++;
                index++;
            }
            encodedString.append(count);
            encodedString.append(stringBuilder.charAt(index));
        }
        System.out.println(encodedString);
    }
}
