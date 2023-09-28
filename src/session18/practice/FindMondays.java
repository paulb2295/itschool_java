package session18.practice;

import java.time.LocalDate;

public class FindMondays {

    public static void main(String[] args) {

        LocalDate nextMonday = findNextMonday();
        LocalDate temp = nextMonday.plusYears(1);
        while(nextMonday.isBefore(temp)){
            System.out.println(nextMonday);
            nextMonday = nextMonday.plusDays(7);
        }
    }

    private static LocalDate findNextMonday() {
        LocalDate today = LocalDate.now();
        for (int index = 0; index < 7; index++) {
            today = today.plusDays(index);
            if(today.getDayOfWeek().getValue() == 1){
                return today;
            }
        }
        return null;
    }
}
