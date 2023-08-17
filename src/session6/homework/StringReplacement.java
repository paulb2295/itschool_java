package session6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReplacement {

    public static void main(String[] args) {
        StringBuilder stringtoSearchIn = new StringBuilder();
        stringtoSearchIn.append("The cat sat on the mat.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the word you want to replace.");
        String toBeReplaced = scanner.nextLine();
        System.out.println("Inserte the word yo want to replace it with.");
        String replacer = scanner.nextLine();
        if (!(wordSearch(stringtoSearchIn, toBeReplaced)).isEmpty()) {
            stringReplacer(wordSearch(stringtoSearchIn, toBeReplaced), replacer, stringtoSearchIn);
        } else {
            System.out.println("The replacer was not found in the text.");
        }
    }


    public static ArrayList wordSearch(StringBuilder text, String word) {
        ArrayList indexList = new ArrayList();
        for (int stringIndex = 0; stringIndex < text.length(); stringIndex++) {
            if (stringIndex + word.length() < text.length()
                    && text.charAt(stringIndex) == word.charAt(0)) {
                StringBuilder buffer = new StringBuilder();
                buffer.append(text.substring(stringIndex, stringIndex + word.length()));
                if (word.equalsIgnoreCase(buffer.toString())) {
                    indexList.add(stringIndex);
                    indexList.add(stringIndex + word.length());
                }
            }
        }
        return indexList;
    }

    public static void stringReplacer(ArrayList<Integer> indexList, String replacer, StringBuilder text) {
        StringBuilder buffer = new StringBuilder(replacer);
        for (int index = 0; index < indexList.size(); index += 2) {
            if (buffer.length() <= (indexList.get(index + 1) - indexList.get(index))) {
                text.replace(indexList.get(index), indexList.get(index + 1), buffer.toString());
            } else {
                buffer.replace((indexList.get(index + 1) - indexList.get(index)), indexList.get(index + 1), " ");
                text.replace(indexList.get(index), indexList.get(index + 1), buffer.toString().strip());
            }
        }
        System.out.println(text);
    }
}
