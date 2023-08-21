package session7.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayingTodaysDate {

    public static void main(String[] args) {
        displayTodayDate();

    }

    public static void displayTodayDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(formatDateTime);
    }
}
