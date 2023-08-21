package session7.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.lang.Math.abs;

public class DurationSince {

    public static void main(String[] args) {
        System.out.println("Insert a time in the format HH:MM:SS");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        elapsedTimeSince(input);
    }


    public static void elapsedTimeSince(String input) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        try {
            hours = Integer.parseInt(input.substring(0, 2));
            minutes = Integer.parseInt(input.substring(3, 5));
            seconds = Integer.parseInt(input.substring(6));
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime then = LocalDateTime.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth(), hours, minutes, seconds);
            hours = abs(now.getHour() - then.getHour());
            minutes = abs(now.getMinute() - then.getMinute());
            seconds = abs(now.getSecond() - then.getSecond());
            System.out.printf("Hours difference: %d \nMinutes difference: %d \nSeconds difference: %d", hours, minutes, seconds);
        } catch (Exception exception) {
            System.out.println("!Invalid format!");
        }

    }
}
