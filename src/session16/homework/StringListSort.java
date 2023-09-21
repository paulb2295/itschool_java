package session16.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringListSort {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Plum", "Cherry", "Apple", "Blackberry", "Avocado");
        strings.sort((stringOne, stringTwo) -> stringOne.compareTo(stringTwo));
        strings.forEach(System.out::println);

    }
}
