package session16.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface IntListsOperator {
    List<Integer> intOperator(List<Integer> list);
}

class IntOperatorTest {
    public static void main(String[] args) {
        IntListsOperator intListsOperator = (list -> {
            List<Integer> outputList = new ArrayList<>();
            for (int item : list) {
                outputList.add(intPower(item));
            }
            return outputList;
        });

        List<Integer> integerList = Arrays.asList(2, 6, 7, 9, 1, 2);
        System.out.println(intListsOperator.intOperator(integerList));
    }

    private static int intPower(int number) {
        return number * number;
    }
}
