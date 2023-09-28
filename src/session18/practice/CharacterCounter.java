package session18.practice;

import java.util.Arrays;

public class CharacterCounter {

    public static void main(String[] args) {
        String text = "Hello Word ab";
        System.out.println(countWordsLongerThan(text, 3));
    }

    private static int countWordsLongerThan(String input, int length) {
        return (int) Arrays.stream(input.split(" "))
                .filter(word -> word.length() > length)
                .count();
    }
}
