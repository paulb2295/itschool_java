package session17.homework;

import java.util.Arrays;

public class SumOfArrayNumbers {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum = " + sum(numbers));
    }

    private static int sum(Integer[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, Integer::sum);
    }
}
