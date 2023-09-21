package session16.homework;

import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface
interface StringLengthComparator {
    int comparator ( String stringOne, String stringTwo);
}

class StringLenCompTest{
    public static void main(String[] args) {
        StringLengthComparator stringLengthComparator = (string1, string2) ->Integer.max(string1.length(),string2.length());
        String stringOne = "Banana";
        String stringTwo = "Dragon Fruit";
        System.out.println(stringLengthComparator.comparator(stringOne,stringTwo));
    }

}


