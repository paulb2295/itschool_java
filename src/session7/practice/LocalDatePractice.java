package session7.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDatePractice {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

         LocalDate localDateIncrement=  localDate.plusDays(10);
        System.out.println(localDateIncrement);

        System.out.println(findSunday(LocalDate.now()));
    }

    public static LocalDate findSunday (LocalDate localDate){
         LocalDate now = LocalDate.now();
         return  localDate.plusDays(DayOfWeek.SUNDAY.getValue() - localDate.getDayOfWeek().getValue());
    }
}
