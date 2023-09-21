package session16.homework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfInts {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 22, 34, 53, 8);
        AtomicInteger sum = new AtomicInteger();
        ints.forEach(integer -> sum.addAndGet(integer));
        System.out.println(sum);
    }
}
