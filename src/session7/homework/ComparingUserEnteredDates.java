package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class ComparingUserEnteredDates {

    public static void main(String[] args) {

        System.out.println("Insert to dates respecting the following format: YYYY-MM-DD ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first date:");
        LocalDate localDateOne = LocalDate.parse(scanner.nextLine());
        System.out.println("Insert the second date:");
        LocalDate localDateTwo = LocalDate.parse(scanner.nextLine());

        System.out.println("First date is the same as second date: " + dateComparison(localDateOne, localDateTwo));
    }

    public static boolean dateComparison(LocalDate localDateOne, LocalDate localDateTwo) {
        if (localDateOne.compareTo(localDateTwo) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
