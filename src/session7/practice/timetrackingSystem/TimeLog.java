package session7.practice.timetrackingSystem;


import java.time.LocalDateTime;

public class TimeLog {

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
}
