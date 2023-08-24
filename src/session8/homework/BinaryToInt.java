package session8.homework;

import java.util.Scanner;

public class BinaryToInt {

    public static void main(String[] args) {
        binaryToInt();
    }

    public static void binaryToInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the binary number you want to convert to int:");
        String binaryNumber = scanner.nextLine();
        int intNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println(binaryNumber + " = " + intNumber);
    }
}
