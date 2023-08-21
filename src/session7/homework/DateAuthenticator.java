package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAuthenticator {
    public static void main(String[] args) {

        System.out.println("Enter a day for testing in YYYY-MM-DD format:");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String output = isValidDate(date) ? "adheres" : "does not adhere";
        System.out.println("The input " + output + " to the date format! ");

    }

    public static boolean isValidDate(String string) {

        if (yearValidator(string)
                && monthValidator(string)
                && dayValidator(returnYear(string), returnMonth(string), string)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean yearValidator(String string) {
        StringBuilder year = new StringBuilder();
        int index = 0;
        while (string.charAt(index) != '-') {
            year.append(string.charAt(index));
            index++;
        }
        return year.length() == 4;
    }

    public static int returnYear(String string) {
        StringBuilder year = new StringBuilder(string.substring(0, 4));
        return Integer.parseInt(year.toString());
    }

    public static boolean monthValidator(String string) {
        StringBuilder month = new StringBuilder();
        for (int index = string.indexOf('-') + 1; index < string.length(); index++) {
            if (string.charAt(index) != '-') {
                month.append(string.charAt(index));
            } else {
                break;
            }
        }

        if (Integer.parseInt(month.toString()) > 0
                && Integer.parseInt(month.toString()) <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public static int returnMonth(String string) {
        StringBuilder month = new StringBuilder(string.substring(string.indexOf('-') + 1, string.indexOf('-') + 3));
        return Integer.parseInt(month.toString());
    }

    public static boolean dayValidator(int year, int month, String string) {
        StringBuilder day = new StringBuilder();
        for (int index = string.length() - 1; index >= 0; index--) {
            if (string.charAt(index) != '-') {
                day.append(string.charAt(index));
            } else {
                break;
            }
        }
        day.reverse();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: {
                if (Integer.parseInt(day.toString()) > 31) {
                    return false;
                } else {
                    return true;
                }
            }
            case 4, 6, 9, 11: {
                if (Integer.parseInt(day.toString()) > 30) {
                    return false;
                } else {
                    return true;
                }
            }
            case 2: {
                if ((year % 4 == 0 && Integer.parseInt(day.toString()) <= 29)
                        || (year % 4 != 0 && Integer.parseInt(day.toString()) <= 28)) {
                    return true;
                } else {
                    return false;
                }
            }
            default:
                return false;
        }
    }
}
