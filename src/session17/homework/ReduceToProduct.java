package session17.homework;

import java.util.Arrays;
import java.util.List;

public class ReduceToProduct {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println("String numbers product= " + productOfStringNumbers(numbers));
    }

    private static int productOfStringNumbers(List<String> input) {
        int result = input.stream()
                .map(Integer::parseInt)
                .reduce(1, (num1, num2) -> num1 * num2);
        return result;
    }
}
