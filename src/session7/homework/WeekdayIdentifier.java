package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class WeekdayIdentifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the a date in the following format YYYY-MM-DD:");
        LocalDate localDate = LocalDate.parse(scanner.nextLine());

        findDayOfWeek(localDate);
    }

    public static void findDayOfWeek(LocalDate localDate) {
        System.out.println(localDate.getDayOfWeek());
    }
}
