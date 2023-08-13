package session5.homework;

import java.util.Scanner;

public class CountingNegativeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers in the array with , and spaces; like 22, 33, 1 :");
        String input = scanner.nextLine();

        int[] array = new int[arrayLenght(input)];
        stringToArray(input, array);
        printArray(array, arrayLenght(input));

        System.out.println();
        if (negativeIntCounter(array, arrayLenght(input)) == 1) {
            System.out.println("The inserted array has " + negativeIntCounter(array, arrayLenght(input)) + " negative number!");
        } else {
            System.out.println("The inserted array has " + negativeIntCounter(array, arrayLenght(input)) + " negative numbers!");
        }

        scanner.close();
    }

    public static int arrayLenght(String string) {
        char[] stringCharArray = string.toCharArray();
        int arrayLenght = 1;
        for (int index = 0; index < stringCharArray.length; index++) {
            if (stringCharArray[index] == ',') {
                arrayLenght++;
            }
        }
        return arrayLenght;
    }

    public static void stringToArray(String string, int[] array) {
        int currentArrayIndex = 0;
        String number;
        char[] stringCharArray = string.toCharArray();
        int index = 0;
        while (index < stringCharArray.length) {
            number = "";
            while (index < stringCharArray.length && stringCharArray[index] != ',') {
                switch (stringCharArray[index]) {
                    case '0':
                        number += "0";
                        break;
                    case '1':
                        number += '1';
                        break;
                    case '2':
                        number += '2';
                        break;
                    case '3':
                        number += '3';
                        break;
                    case '4':
                        number += '4';
                        break;
                    case '5':
                        number += '5';
                        break;
                    case '6':
                        number += '6';
                        break;
                    case '7':
                        number += '7';
                        break;
                    case '8':
                        number += '8';
                        break;
                    case '9':
                        number += '9';
                        break;
                    case '-':
                        number += '-';
                        break;
                    default:
                        break;
                }
                index++;
            }
            if (number != "") {
                array[currentArrayIndex] = Integer.parseInt(number);
                currentArrayIndex++;
            }
            index++;
        }
    }

    public static int negativeIntCounter(int[] array, int arrayLenght) {
        int negativeCounter = 0;
        for (int i = 0; i < arrayLenght; i++) {
            if (array[i] < 0) {
                negativeCounter++;
            }
        }
        return negativeCounter;
    }

    public static void printArray(int[] array, int arrayLenght) {
        int negativeCounter = 0;
        for (int i = 0; i < arrayLenght; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
