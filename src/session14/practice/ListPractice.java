package session14.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        List<Integer> myList = initializeList();
        System.out.println(myList);

        List<Integer> updatedList = updateList(myList, 3, 27);
        System.out.println(updatedList);


        boolean isValuePresent = searchElement(updatedList, 8);
        System.out.println("Is value present: " + isValuePresent);

        List<Integer> evenNumbers = filterEvenNumbers(myList);
        System.out.println(evenNumbers);

        System.out.println("Maximum value from list: " + findMaximum(evenNumbers));
    }

    private static List<Integer> initializeList() {
        List<Integer> myList = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            myList.add(index);
        }
        return myList;
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value) {
        if (index < 0 || index >= list.size()) {

            System.out.println("Invalid index");
            return list;
        }
        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        //result = list;
        return result;
    }

    public static boolean searchElement(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static Integer findMaximum(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        int maxValue = list.get(0);
        for (int number : list) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }
}
