package session5.homework;

import java.util.Scanner;

public class FibonacciSeriesGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number for the Fibonacci Series:");
        int input = scanner.nextInt();

        int[] fibonacciSeries = fibonacciSeriesGenerator(input);
        printArray(fibonacciSeries, input);

        System.out.println();

        int[] recursiveFibonacciSeries = recursiveFibonacciSeriesGenerator(input);
        printArray(recursiveFibonacciSeries, input);

    }

    public static int[] fibonacciSeriesGenerator(int number) {
        int[] fibonacciSeries = new int[number];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int index = 2; index < number; index++) {
            fibonacciSeries[index] = fibonacciSeries[index - 1] + fibonacciSeries[index - 2];
        }
        return fibonacciSeries;
    }

    public static int recursiveFibonacciNumber(int number) {
        if (number <= 1) {
            return number;
        } else {
            return recursiveFibonacciNumber(number - 1) + recursiveFibonacciNumber(number - 2);
        }
    }

    public static int[] recursiveFibonacciSeriesGenerator(int number) {
        int[] recursiveFibonacciSeries = new int[number];
        for (int index = 0; index < number; index++) {
            recursiveFibonacciSeries[index] = recursiveFibonacciNumber(index);
        }
        return recursiveFibonacciSeries;
    }

    public static void printArray(int[] array, int lenght) {
        for (int index = 0; index < lenght; index++) {
            if (index == lenght - 1) {
                System.out.print(array[index]);
            } else {
                System.out.print(array[index] + " ");
            }
        }
    }
}
