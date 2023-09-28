package session18.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 7, 55, 1, 54, 2, 53);
        System.out.println("Min: " + min(numbers));
        System.out.println("Max: " + max(numbers));
    }

    private static int min(List<Integer> list) {
        int min = list.stream()
                .min(Integer::compare)
                .orElse(0);
        return min;
    }

    private static int max(List<Integer> list) {
        int max = list.stream()
                .max(Integer::compare)
                .orElse(0);
        return max;
    }
}
