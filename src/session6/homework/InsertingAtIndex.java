package session6.homework;

import java.util.Scanner;

public class InsertingAtIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a sentence:");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        System.out.println("Insert a word to be inserted in the sentence:");
        StringBuilder toInsert = new StringBuilder(scanner.nextLine());
        System.out.println("At what position?:");
        int position = scanner.nextInt();
        insert(text, toInsert, position);

    }

    public static void insert(StringBuilder text, StringBuilder word, int position) {
        System.out.println(text.insert(position, " " + word + " "));
    }
}
