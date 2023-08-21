package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        System.out.println("Insert the amount of weeks to add to current date:");
        Scanner scanner = new Scanner(System.in);
        int numberOfWeeks = scanner.nextInt();
        addWeeksTotoday(numberOfWeeks);
    }

    public static void addWeeksTotoday(int weeks) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDateFuture = localDate.plusWeeks(weeks);
        System.out.println(localDate + " + " + weeks + " weeks = " + localDateFuture);
    }
}
