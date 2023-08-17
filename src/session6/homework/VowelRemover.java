package session6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelRemover {

    public static final ArrayList<String> vowelList = new ArrayList<>() {
        {
            this.add("A");
            this.add("E");
            this.add("I");
            this.add("O");
            this.add("U");
        }
    };

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Insert the string from witch you want to remove the vowels:");
        String input = scaner.nextLine();
        vowelRemover(input);
    }

    public static void vowelRemover(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int index = 0; index < stringBuilder.length(); index++) {
            for (String vowel : vowelList) {
                if (vowel.equalsIgnoreCase(stringBuilder.substring(index, index + 1))) {
                    vowelMover(stringBuilder, index);
                    if (index > 0) {
                        --index;
                    }
                }
            }
        }
        stringBuilder.trimToSize();
        System.out.println(stringBuilder);

    }

    public static StringBuilder vowelMover(StringBuilder stringBuilder, int indexOfChar) {
        for (int index = indexOfChar; index < stringBuilder.length(); index++) {
            stringBuilder.replace(index, index + 1, " ");
            if (index + 1 < stringBuilder.length()) {
                stringBuilder.replace(index, index + 1, stringBuilder.substring(index + 1, index + 2));
            }
        }
        return stringBuilder;
    }

}
