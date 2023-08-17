package session6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first string:");
        StringBuilder textOne = new StringBuilder(scanner.nextLine());
        System.out.println("Insert the second string:");
        StringBuilder textTwo = new StringBuilder(scanner.nextLine());
        System.out.println("Result:");
        if (anagramCheker(charCounter(textOne), charCounter(textTwo))) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }
    }

    public static ArrayList charCounter(StringBuilder stringBuilder) {
        ArrayList<String> counter = new ArrayList<>();
        for (int index = 0; index < stringBuilder.length(); index++) {
            char buffer = stringBuilder.charAt(index);
            int count = 1;
            if (!isCounted(buffer, counter)) {
                for (int indexTwo = index + 1; indexTwo < stringBuilder.length(); indexTwo++) {
                    if (stringBuilder.charAt(indexTwo) == buffer) {
                        count++;
                        index++;
                    }
                }
                counter.add(Integer.toString(count));
                counter.add(buffer + " ");
            } else {
                index++;
            }
        }
        return counter;
    }

    public static boolean isCounted(char character, ArrayList<String> counterArray) {
        for (String element : counterArray) {
            if (element.contains(Character.toString(character))) {
                return true;
            }
        }
        return false;
    }

    public static boolean anagramCheker(ArrayList<String> text1, ArrayList<String> text2) {
        ArrayList<Boolean> checker = new ArrayList<Boolean>();
        for (int index = 0; index < text1.size(); index++) {
            checker.add(false);
        }
        boolean isAnagram = false;
        if (text1.size() == text2.size()) {
            for (String element : text1) {
                for (String elementTwo : text2) {
                    if (element.equalsIgnoreCase(elementTwo)) {
                        checker.add(true);
                    }
                }
            }
        }
        for (boolean bool : checker) {
            if (bool) {
                isAnagram = true;
            } else if (!bool && (text1.size()) != text2.size()) {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
}
