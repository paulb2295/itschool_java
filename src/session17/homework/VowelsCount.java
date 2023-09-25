package session17.homework;

import java.util.Arrays;

public class VowelsCount {

    public static void main(String[] args) {

        String sentence = "Hello World";
        System.out.println("number of vowels: " + vowelCount(sentence));
    }

    private static long vowelCount(String string) {
        long vowelCount = string.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        return vowelCount;
    }
}
