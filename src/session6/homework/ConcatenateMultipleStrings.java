package session6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        stringInputConcat();
    }

    public static void stringInputConcat() {
        Scanner scanner = new Scanner(System.in);
        String input = new String();
        ArrayList<String> stringArrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        while (!input.equals("~")) {
            System.out.println("Insert strings to concatenate.");
            System.out.println("Insert ~ on a new line to terminate input.");
            input = scanner.nextLine();
            stringArrayList.add(input);
        }
        for (String string : stringArrayList) {
            if (!string.equals("~")) {
                stringBuilder.append(string);
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
