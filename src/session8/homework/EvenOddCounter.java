package session8.homework;

import java.util.Scanner;

public class EvenOddCounter {

    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        evenOddCounter(arrayInput());
    }

    public static int[] arrayInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = new int[ARRAY_SIZE];
        System.out.println("Insert 10 number separated by enter:");
        for (int index = 0; index < ARRAY_SIZE; index++) {
            numbersArray[index] = scanner.nextInt();
        }
        return numbersArray;
    }

    public static void evenOddCounter(int[] numbersArray) {
        int odd = 0;
        int even = 0;
        for (int number : numbersArray) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("The array has %d odd numbers and %d even numbers.", odd, even);
    }
}
