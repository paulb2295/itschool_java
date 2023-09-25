package session17.homework;

import java.util.List;
import java.util.Arrays;

public class StringsToLength {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        System.out.println("Strings length: " + stringLength(strings));
    }

    private static List<Integer> stringLength(List<String> input) {
        List<Integer> output = input.stream()
                .map(String::length)
                .toList();
        return output;
    }
}
