package session17.homework;

import java.util.Arrays;
import java.util.List;
;

public class NumberOfCharacters {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        System.out.println("Number of characters excluding whitespaces: " + numberOfCharacters(strings));
    }

    private static int numberOfCharacters(List<String> list) {
        long number = list.stream()
                .flatMapToInt(CharSequence::chars) // Use flatMapToInt to get an IntStream of characters
                .filter(character -> !Character.isWhitespace(character)) // Filter out whitespace characters
                .count();

        return (int) number;
    }
}
