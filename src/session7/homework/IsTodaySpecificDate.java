package session7.homework;

import java.time.LocalDate;

public class IsTodaySpecificDate {

    public static void main(String[] args) {

        String is = isTodaySpecificDate(createSpecificDate()) == true ? "is" : "is not";
        System.out.println("Today " + is + " " + createSpecificDate() + ".");
    }

    public static boolean isTodaySpecificDate(LocalDate specificDate) {
        LocalDate now = LocalDate.now();
        if (now.compareTo(specificDate) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static LocalDate createSpecificDate() {
        LocalDate localDate = LocalDate.of(2019, 12, 10);
        return localDate;
    }
}
