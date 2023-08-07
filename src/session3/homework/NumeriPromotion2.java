package session3.homework;

import java.util.Scanner;

public class NumeriPromotion2 {

    public static void main(String[] args) {

        byte firstNumber, secondNumber;
        System.out.println("Largest Byte" + Byte.MAX_VALUE + ".");
        System.out.println("Smallest Byte" + Byte.MIN_VALUE + ".");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first byte number: ");
        String userInput = scanner.nextLine();
        firstNumber = Byte.parseByte(userInput);

        System.out.println("Please provide the second byte number: ");
        userInput = scanner.nextLine();
        secondNumber = Byte.parseByte(userInput);

        byte result = (byte) (firstNumber + secondNumber);
        //java: incompatible types: possible lossy conversion from int to byte unless typecasted
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
    }
}
