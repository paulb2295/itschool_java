package session7.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class IntervalBetweenDates {

    public static void main(String[] args) {

        System.out.println("Insert to dates respecting the following format: YYYY-MM-DD ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first date:");
        LocalDate localDateOne = LocalDate.parse(scanner.nextLine());
        System.out.println("Insert the second date:");
        LocalDate localDateTwo = LocalDate.parse(scanner.nextLine());

        System.out.println("Days between the two dates, ignoring leap year: " + daysBetweenLeapYearIgnore(localDateOne, localDateTwo));
        System.out.println("Days between the two dates, with leap year acknowledgement: " + daysBetween(localDateOne, localDateTwo));
    }

    public static int daysBetween(LocalDate localDateOne, LocalDate localDateTwo) {
        ArrayList<Integer> yearsDays = new ArrayList();
        LocalDate minYear = localDateOne.compareTo(localDateTwo) > 0 ? LocalDate.parse(Integer.toString(localDateTwo.getYear()) + "-12-31") : LocalDate.parse(Integer.toString(localDateOne.getYear()) + "-12-31");
        LocalDate maxYear = localDateOne.compareTo(localDateTwo) < 0 ? LocalDate.parse(Integer.toString(localDateTwo.getYear()) + "-12-31") : LocalDate.parse(Integer.toString(localDateOne.getYear()) + "-12-31");

        while (minYear.getYear() < maxYear.getYear()) {
            yearsDays.add(minYear.getDayOfYear());
            minYear = minYear.plusYears(1);
        }
        int result = 0;
        for (int year : yearsDays) {
            result += year;
        }
        int days = abs(localDateOne.getDayOfYear() - localDateTwo.getDayOfYear());
        return result + days;
    }

    public static int daysBetweenLeapYearIgnore(LocalDate localDateOne, LocalDate localDateTwo) {
        int years = abs(localDateOne.getYear() - localDateTwo.getYear());
        int days = abs(localDateOne.getDayOfYear() - localDateTwo.getDayOfYear());
        int result = (years * 365) + days;
        return result;
    }


}
