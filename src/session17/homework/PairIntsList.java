package session17.homework;

import java.util.Arrays;
import java.util.List;

public class PairIntsList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        System.out.println(pairNumbers(numbers));
    }

    private static List<Integer> pairNumbers(List<Integer> input) {
        List<Integer> output = input.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        return output;
    }
}

