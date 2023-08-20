package session7.practice;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {
        printRandomNumbers(1, 5000);
    }

    public static void printRandomNumbers (int startInterval, int endInterval){
        Random random = new Random();
        for (int index = 0; index <100; index++) {
            System.out.println(random.nextInt(startInterval, endInterval));
        }
    }
}
