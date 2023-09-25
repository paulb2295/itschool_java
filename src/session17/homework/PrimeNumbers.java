package session17.homework;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int index = 1; index <= 100; index++) {
            numbers.add(index);
        }
        System.out.println(primeNumbers(numbers));

    }

    private static List<Integer> primeNumbers(List<Integer> numbers) {
        List<Integer> primes = numbers.stream()
                .filter(number -> number != 1
                        && (number == 2 || number % 2 != 0)
                        && (number == 3 || number % 3 != 0)
                        && (number == 5 || number % 5 != 0)
                        && (number == 7 || number % 7 != 0))
                .toList();
        return primes;
    }

}
