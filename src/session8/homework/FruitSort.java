package session8.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.abs;

public class FruitSort {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Melon");
        fruits.add("Plum");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Cherry");
        fruits.add("Blueberry");
        fruits.add("Blackberry");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Fig");
        fruits.add("Coco");
        fruits.add("Tomato");
        fruits.add("Jabuticaba");
        fruits.add("Raspberry");

        fruitsSorter(fruits);


    }

    public static void fruitsSorter(List<String> fruits) {
        List<StringBuilder> editableList = new ArrayList<>();
        for (String fruit : fruits) {
            StringBuilder stringBuilder = new StringBuilder(fruit);
            editableList.add(stringBuilder);
        }

        bubbleSort(editableList);
        alphabeticSort(editableList);
        System.out.println(editableList);

    }

    public static void bubbleSort(List<StringBuilder> fruits) {
        boolean changesMade;
        StringBuilder container = new StringBuilder();
        do {
            changesMade = false;
            for (int index = 0; index < fruits.size(); index++) {
                if (index < fruits.size() - 1
                        && fruits.get(index).length() < fruits.get(index + 1).length()) {
                    container.append(fruits.get(index));
                    fruits.get(index).append(fruits.get(index + 1));
                    fruits.get(index).delete(0, container.length());
                    fruits.get(index + 1).append(container);
                    fruits.get(index + 1).delete(0, abs(container.length() - fruits.get(index + 1).length()));
                    container.delete(0, container.length());
                    changesMade = true;
                }
            }
        } while (changesMade);
    }

    public static void alphabeticSort(List<StringBuilder> fruits) {
        for (int index = 0; index < fruits.size(); index++) {
            if (index < (fruits.size() - 1)
                    && fruits.get(index).length() == fruits.get(index + 1).length()) {
                Collections.sort(fruits.subList(index, index + 2));
            }
        }
    }
}
