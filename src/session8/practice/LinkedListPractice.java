package session8.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Chuck");
        names.add("Eva");
        names.add("Mary");

        names.add(2, "Frank");

        System.out.println(names);
    }
}
