package session16.homework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface
interface MaxListInt {
    AtomicInteger printMax (List<Integer> list);
}

class MaxTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 0 , 2, 4, 66, 109, 2002);
        MaxListInt maxListInt = list0 -> calculateMax(list0);
        System.out.println(maxListInt.printMax(list));
    }

    private static AtomicInteger calculateMax(List<Integer> list){
        AtomicInteger max = new AtomicInteger();
        list.forEach((item) -> max.updateAndGet(currentMax ->Math.max(currentMax,item)));
        return max;
    }
}
