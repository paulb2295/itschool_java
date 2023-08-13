package session5.homework;

import java.util.Scanner;

public class EvenOddArrayNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the lenght of the array:");
        int length = scanner.nextInt();

        int[] array = new int[length];
        arrayInitializer(array);

        oddEvenNumberChecker(array);
    }

    public static void arrayInitializer(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < array.length; index++) {
            System.out.println("Input number " + (index + 1) + " out of " + array.length + " in the array");
            array[index] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void oddEvenNumberChecker(int[] array) {
        for (int arrayElement : array) {
            if (arrayElement % 2 == 0) {
                System.out.println(arrayElement + " is Even");
            } else {
                System.out.println(arrayElement + " is Odd");
            }
        }
    }
}
