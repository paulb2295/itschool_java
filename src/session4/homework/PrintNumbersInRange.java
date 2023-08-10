package session4.homework;

import java.util.Scanner;

public class PrintNumbersInRange {

    public static void main(String[] args) {

        for (int counter = 1; counter < 11; counter++) {
            System.out.print(counter + " ");
        }

        System.out.println();

        for (int counter = 1; counter < 11; counter++) {
            if (counter % 2 == 0) {
                System.out.print(counter + " ");
            }
        }
    }
}
