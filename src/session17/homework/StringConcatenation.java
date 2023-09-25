package session17.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four");
        System.out.println(stringConcat(strings));
    }

    private static String stringConcat(List<String> input) {
        String output = input.stream()
                .collect(Collectors.joining(", "));
        return output;
    }
}
