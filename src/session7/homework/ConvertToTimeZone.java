package session7.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class ConvertToTimeZone {

    public static final int HOURS = 0;
    public static final int MINUTES = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert timezone:");
        String timeZoneId = scanner.nextLine();

        convertToTimezone(localDateTimeInput(), timeZoneId);

    }

    public static void convertToTimezone(LocalDateTime localDateTime, String timeZoneId) {
        int[] inputOffset = getTimezoneOffset(timeZoneId);
        int[] currentOffset = getCurrentTimeZoneOffset();
        int[] finalOffset = new int[2];
        finalOffset[HOURS] = inputOffset[HOURS] - currentOffset[HOURS];
        finalOffset[MINUTES] = inputOffset[MINUTES] - currentOffset[MINUTES];
        localDateTime = localDateTime.plusHours(finalOffset[HOURS]);
        localDateTime = localDateTime.plusMinutes(finalOffset[MINUTES]);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String formatedDate = dateTimeFormatter.format(localDateTime);
        System.out.println(formatedDate);
    }

    public static int[] getTimezoneOffset(String inputTimezone) {
        int[] inputOffset = new int[2];
        String[] availableTimeZones = TimeZone.getAvailableIDs();
        for (String timeZoneId : availableTimeZones) {
            if (inputTimezone.equals(timeZoneId)) {
                TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
                int rawOffset = timeZone.getRawOffset();
                int hours = rawOffset / (60 * 60 * 1000);
                inputOffset[HOURS] = hours;
                int minutes = (rawOffset / (60 * 1000)) % 60;
                inputOffset[MINUTES] = minutes;
                break;
            }
        }
        return inputOffset;
    }

    public static int[] getCurrentTimeZoneOffset() {
        int[] currentOffset = new int[2];
        TimeZone timeZone = TimeZone.getDefault();

        int rawOffset = timeZone.getRawOffset();
        int hours = rawOffset / (60 * 60 * 1000);
        currentOffset[HOURS] = hours;
        int minutes = (rawOffset / (60 * 1000)) % 60;
        currentOffset[MINUTES] = minutes;

        return currentOffset;
    }

    public static LocalDateTime localDateTimeInput() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert year:");
            int year = scanner.nextInt();
            System.out.println("Insert month:");
            int month = scanner.nextInt();
            System.out.println("Insert day:");
            int day = scanner.nextInt();
            System.out.println("Insert hour:");
            int hour = scanner.nextInt();
            System.out.println("Insert minutes:");
            int minutes = scanner.nextInt();
            System.out.println("Insert seconds:");
            int seconds = scanner.nextInt();
            LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minutes, seconds);
            return localDateTime;
        } catch (Exception exception) {
            System.out.println("Invalid input!");
            LocalDateTime localDateTime = LocalDateTime.now();
            return localDateTime;
        }

    }
}
