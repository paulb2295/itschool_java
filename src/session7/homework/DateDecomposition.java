package session7.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDecomposition {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        displayDateComponents(localDate);
    }

    public static void displayDateComponents(LocalDate localDate) {
        System.out.println("Year: " + localDate.getYear());
        System.out.println("Month: " + localDate.getMonthValue());
        System.out.println("Day: " + localDate.getDayOfMonth());
    }

}
