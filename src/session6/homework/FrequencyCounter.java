package session6.homework;

import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string:");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        System.out.println("Character count:");
        charCounter(text);
    }

    public static void charCounter(StringBuilder stringBuilder) {
        StringBuilder counter = new StringBuilder();
        for (int index = 0; index < stringBuilder.length(); index++) {
            char buffer = stringBuilder.charAt(index);
            int count = 1;
            if (!isCounted(buffer, counter)) {
                for (int indexTwo = index + 1; indexTwo < stringBuilder.length(); indexTwo++) {
                    if (stringBuilder.charAt(indexTwo) == buffer) {
                        count++;
                        index++;
                    }
                }
                counter.append(count);
                counter.append(buffer + " ");
            } else {
                index++;
            }
        }
        System.out.println(counter);
    }

    private static boolean isCounted(char character, StringBuilder stringBuilder) {
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (stringBuilder.charAt(index) == character) {
                return true;
            }
        }
        return false;
    }
}
