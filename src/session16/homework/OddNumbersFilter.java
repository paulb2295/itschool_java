package session16.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface OddNumbersFilter {
    List<Integer> oddFilter( List<Integer> list);
}

class OddFilterTest{

    public static void main(String[] args) {
        OddNumbersFilter oddNumbersFilter = (list -> {
           List<Integer> oddList = new ArrayList<>();
            for (int number: list) {
                if (number%2 != 0 ){
                    oddList.add(number);
                }
            }
            return oddList;
        });


        List<Integer> list = Arrays.asList(2,5, 7, 2 ,6, 3, 9, 7);
        System.out.println(oddNumbersFilter.oddFilter(list));
    }
}