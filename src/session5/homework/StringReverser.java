package session5.homework;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the string you want to reverse:");
        String input = scanner.nextLine();

        char[] charArray = stringToCharArray(input);
        Stack stack = new Stack(charArray.length);
        pushElementsIntoStack(stack, charArray);

        char[] reversedCharArray = popElementsFromStack(stack);

        printArray(reversedCharArray, reversedCharArray.length);

        scanner.close();
    }

    public static char[] stringToCharArray(String string) {
        return string.toCharArray();
    }

    public static void pushElementsIntoStack(Stack stack, char[] charArray) {
        int index = 0;
        while (!stack.stackIsFull()) {
            stack.pushElementIntoStack(charArray[index]);
            index++;
        }
    }

    public static char[] popElementsFromStack(Stack stack) {
        char[] charArray = new char[stack.getTop() + 1];
        int index = 0;
        while (!stack.stackIsEmpty()) {
            charArray[index] = stack.popElementFromStack();
            index++;
        }
        return charArray;
    }

    public static void printArray(char[] charArray, int lenght) {
        for (int index = 0; index < lenght; index++) {
            System.out.print(charArray[index]);
        }
    }
}
