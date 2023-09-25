package session17.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        System.out.println("Max length String: " + longestString(strings));
    }

    private static String longestString(List<String> input) {
        String output = input.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        return output;
    }
}
