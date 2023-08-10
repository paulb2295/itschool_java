package session5.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
        printWithWhile(10);
        System.out.println();
        printNumberWithDoWhile(10);
        System.out.println();
        printNumberWithFor(10);
        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("Timisoara");
        list.add("Bucuresti");
        list.add("Cluj");
        printListWithForEach(list);
        System.out.println();

        printListWithFor(list);
        System.out.println();

    }


    public static void printWithWhile(int upperBound) {
        int number = 1;
        while (number <= upperBound) {
            if (number == 10) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }
            number++;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;
        do {
            System.out.print(number + ", ");
            number++;
            if (number == input) {
                System.out.print(number);
            }
        } while (number < input);
    }

    public static void printNumberWithFor(int input) {
        for (int number = 1; number <= input; number++) {
            if (number == input) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }
        }
    }

    public static void printListWithForEach(List<String> list) {

        for (String listValue : list
        ) {
            if (list.indexOf(listValue) == (list.size() - 1)) {
                System.out.print(listValue);
            } else {
                System.out.print(listValue + ", ");
            }

        }
    }

    public static void printListWithFor(List<String> list) {
        for (int index = 0; index < list.size(); index++) {
            if (index == (list.size() - 1)) {
                System.out.print(list.get(index));
            } else {
                System.out.print(list.get(index) + ", ");
            }
        }
    }
}
