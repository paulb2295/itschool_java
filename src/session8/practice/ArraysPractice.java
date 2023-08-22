package session8.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 3, 2, 10};
        printArrayAverage(numbers);

        String[][] names = {{"Ms", "Mr"}, {"Maria", "John"},};
        printMultidimensionalArray(names);

        printIntSortedArray(numbers);

        printStringSortedArray(names[1]);

        printStringSearchResult(names[1], "Maria");

        printIntSearchResult(numbers, 5);

    }

    //ctrl+alt+m -> transform a block of code into a method
    private static void printArrayAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        double averageResult = (double) sum / numbers.length;
        System.out.println("\nArrays length: " + numbers.length);
        System.out.println("Average result: " + averageResult);
    }

    public static void printMultidimensionalArray(String[][] names) {
        for (int lineIndex = 0; lineIndex < names.length; lineIndex++) {
            for (int rowIndex = 0; rowIndex < names[lineIndex].length; rowIndex++) {
                System.out.print(names[rowIndex][lineIndex] + " "); //on columns
            }
            System.out.println();
        }
    }

    public static void printStringSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);
        for (String input : arrayInput) {
            System.out.print(input + " ");
        }
        System.out.println();
    }

    public static void printIntSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);
        for (int input : arrayInput) {
            System.out.print(input + " ");
        }
        System.out.println();
    }

    public static void printStringSearchResult(String[] arrayInput, String searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

}
