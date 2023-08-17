package session6.homework;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the text you want to encode");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        System.out.println("Insert the shift value:");
        int shift = scanner.nextInt();
        text = cipher(text, shift);
        System.out.println("Encoded text: " + text);
        text = decoder(text, shift);
        System.out.println("Decoded text: " + text);

    }

    public static StringBuilder cipher(StringBuilder text, int shift) {
        for (int index = 0; index < text.length(); index++) {
            char buffer = text.charAt(index);
            buffer += shift;
            text.replace(index, index + 1, Character.toString(buffer));
        }
        return text;
    }

    public static StringBuilder decoder(StringBuilder text, int shift) {
        for (int index = 0; index < text.length(); index++) {
            char buffer = text.charAt(index);
            buffer -= shift;
            text.replace(index, index + 1, Character.toString(buffer));
        }
        return text;
    }
}
