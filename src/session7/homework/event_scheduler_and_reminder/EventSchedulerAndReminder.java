package session7.homework.event_scheduler_and_reminder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EventSchedulerAndReminder {

    public static void main(String[] args) {
        driverFunction();
    }

    public static void driverFunction() {
        Scheduler scheduler = new Scheduler();
        Scanner scanner = new Scanner(System.in);
        menu();
        String option = scanner.nextLine();
        while (!option.equals("0")) {
            switch (option) {
                case "1" -> {
                    System.out.println("Insert event name:");
                    String name = scanner.nextLine();
                    System.out.println("Insert event description:");
                    String description = scanner.nextLine();
                    System.out.println("Insert event date");
                    LocalDateTime date = localDateTimeInput();
                    System.out.println("Insert event reminder date:");
                    LocalDateTime reminder = localDateTimeInput();
                    Event event = new Event(name, description, date, reminder);
                    scheduler.addEvent(event);
                }
                case "2" -> {
                    System.out.println("Insert a date to view events:");
                    LocalDate date = localDateTimeInput().toLocalDate();
                    scheduler.getEventsOn(date);
                }
                case "3" -> {
                    System.out.println("Upcoming reminders:");
                    scheduler.getPendingReminders();
                }
                case "4" -> {
                    System.out.println("Insert the name of the event you want to delete:");
                    String name = scanner.nextLine();
                    scheduler.removeEvent(name);
                }
                case "5" -> {
                    System.out.println("Insert the number of upcoming events to see");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    scheduler.getUpcomingEvents(number);
                }
                default -> System.out.println("Invalid input!");
            }
            menu();
            option = scanner.nextLine();
        }

    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("0: EXIT PROGRAM.");
        System.out.println("1: Create Event.");
        System.out.println("2: View events on specific date.");
        System.out.println("3: View upcoming reminders.");
        System.out.println("4: Remove event.");
        System.out.println("5: Get upcoming events");
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
