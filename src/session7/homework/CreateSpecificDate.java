package session7.homework;

import java.time.LocalDate;

public class CreateSpecificDate {

    public static void main(String[] args) {

        System.out.println("Specific date: " + createSpecificDate());
    }

    public static LocalDate createSpecificDate() {
        LocalDate localDate = LocalDate.of(2025, 8, 19);
        return localDate;
    }
}
