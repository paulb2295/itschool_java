package session7.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GettingCurrentTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        gettingCurrentTime(localDateTime);
    }

    public static void gettingCurrentTime(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = dateTimeFormatter.format(localDateTime);
        System.out.println(currentTime);
    }
}
