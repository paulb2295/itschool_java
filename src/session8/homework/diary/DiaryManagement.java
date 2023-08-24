package session8.homework.diary;

import session8.homework.diary.Diary;
import session8.homework.diary.Entry;

import java.time.LocalDate;
import java.util.Scanner;

public class DiaryManagement {

    public static void main(String[] args) {
        driverFunction();
    }


    public static void driverFunction() {
        Diary diary = new Diary();
        Scanner scanner = new Scanner(System.in);
        menu();
        String option = scanner.nextLine();
        StringBuilder description = new StringBuilder();
        while (!option.equals("0")) {
            switch (option) {
                case "1" -> {
                    System.out.println("Insert entry date");
                    LocalDate date = localDateInput();
                    System.out.println("Insert entry:");
                    description.delete(0, description.length());
                    description.append(scanner.nextLine());
                    Entry entry = new Entry(date);
                    entry.editEntryText(description);
                    diary.addEntry(entry);
                }
                case "2" -> {
                    System.out.println("Insert a date to edit the entry at that date:");
                    LocalDate date = localDateInput();
                    System.out.println("Insert  edited text:");
                    description.delete(0, description.length());
                    description.append(scanner.nextLine());
                    diary.editEntry(date, description);
                }
                case "3" -> {
                    System.out.println("Enter the date of the entry you want to delete:");
                    LocalDate date = localDateInput();
                    diary.deleteEntry(date);
                }
                case "4" -> {
                    diary.displayAllEntries();
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
        System.out.println("1: Add a new entry.");
        System.out.println("2: Edit an existing entry by date.");
        System.out.println("3: Delete an entry by date.");
        System.out.println("4: Display all entries in reverse chronological order .");
    }

    public static LocalDate localDateInput() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert year:");
            int year = scanner.nextInt();
            System.out.println("Insert month:");
            int month = scanner.nextInt();
            System.out.println("Insert day:");
            int day = scanner.nextInt();
            LocalDate localDate = LocalDate.of(year, month, day);
            return localDate;
        } catch (Exception exception) {
            System.out.println("Invalid input!");
            LocalDate localDate = LocalDate.now();
            return localDate;
        }

    }
}
