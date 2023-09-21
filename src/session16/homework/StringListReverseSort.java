package session16.homework;

import java.util.Arrays;
import java.util.List;

public class StringListReverseSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Plum", "Cherry", "Apple", "Blackberry", "Avocado");
        strings.sort((stringOne, stringTwo) -> stringTwo.compareTo(stringOne));
        strings.forEach(string -> System.out.println(string));
    }
}
