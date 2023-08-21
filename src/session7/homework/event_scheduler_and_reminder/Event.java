package session7.homework.event_scheduler_and_reminder;

import java.time.*;

import static java.lang.Math.abs;

public class Event {

    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public Event() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public void timeUntilEvent() {
        Duration duration = Duration.between(LocalDateTime.now(), eventDateTime);
        long days = duration.toDays();
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        System.out.printf("%s in %d days, %d hours, %d minutes, %d seconds.\n", eventName, days, hours, minutes, seconds);
    }

    public long timeUntilReminder() {
        Duration duration = Duration.between(LocalDateTime.now(), reminderDateTime);
        long days = duration.toDays();
        long hours = duration.toHoursPart();
        hours += days * 24;
        return hours;
    }
}
