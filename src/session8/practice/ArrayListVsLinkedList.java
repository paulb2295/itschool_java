package session8.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        List<String> arraylist = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 100000; index++) {
            arraylist.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }

        long startTimerArrayList = System.currentTimeMillis();

        for (int index = 0; index < 50000; index++) {
            arraylist.add(0, String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();

        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 50000; index++) {
            linkedList.add(0, String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("Array List " + (endTimerArrayList - startTimerArrayList));
        System.out.println("Linked List " + (endTimerLinkedList - startTimerLinkedList));
    }
}
