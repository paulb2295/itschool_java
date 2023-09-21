package session16.homework;

import java.util.Arrays;
import java.util.List;

public class EvenIntegerFilter {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        ints.forEach(integer -> {
            if (integer % 2 == 0) System.out.println(integer);
        });
    }

}
