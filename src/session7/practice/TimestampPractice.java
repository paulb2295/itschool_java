package session7.practice;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

public class TimestampPractice {
    public static void main(String[] args) {

        Timestamp timestamp =  Timestamp.from(Instant.now());
        System.out.println(timestamp);

        Timestamp timestampSystem = new Timestamp(System.currentTimeMillis());
        System.out.println(timestampSystem);

        System.out.println(covertTimestampToLocalDateTime(timestamp));
    }

    public static LocalDateTime covertTimestampToLocalDateTime (Timestamp timestamp){
        return timestamp.toLocalDateTime();
    }
}
