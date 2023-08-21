package session7.homework.event_scheduler_and_reminder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Scheduler {

    public static final int DAYS = 0;
    public static final int HOURS = 1;
    public static final int MINUTES = 2;
    public static final int SECONDS = 3;

    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
        sortEventsAscending();
    }

    public void sortEventsAscending() {
        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event eventOne, Event eventTwo) {
                return eventOne.getEventDateTime().compareTo(eventTwo.getEventDateTime());
            }
        });
    }

    public void removeEvent(String name) {
        for (Event event : events) {
            if (event.getEventName().equals(name)) {
                events.remove(event);
            }
        }
    }

    public void getUpcomingEvents(int numberOfEvents) {
        int index = 0;
        while (index < events.size() && index < numberOfEvents) {
            System.out.println("Event Name: " + events.get(index).getEventName());
            System.out.println("Event Description: " + events.get(index).getEventDescription());
            System.out.println("Event date: " + events.get(index).getEventDateTime());
            System.out.println("=================================================");
            index++;
        }
    }


    public void getEventsOn(LocalDate date) {
        for (Event event : events) {
            LocalDate localDate = event.getEventDateTime().toLocalDate();
            if (localDate.compareTo(date) == 0) {
                System.out.println("Event Name:" + event.getEventName());
                System.out.println("Event Description: " + event.getEventDescription());
                event.timeUntilEvent();
                System.out.println();
            }
        }
    }

    public void getPendingReminders() {
        for (Event event : events) {
            if (event.timeUntilReminder() <= 24 && event.timeUntilReminder() >= 0) {
                System.out.printf("You have a reminder for %s on %s%n", event.getEventName(), event.getEventDateTime());
            }
        }
    }


}
