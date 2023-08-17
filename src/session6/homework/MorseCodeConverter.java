package session6.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter {
    public static final Map<String, String> map = new HashMap<>() {{
        this.put("A", ".-");
        this.put("B", "-...");
        this.put("C", "-.-.");
        this.put("D", "-..");
        this.put("E", ".");
        this.put("F", "..-.");
        this.put("G", "--.");
        this.put("H", "-.-");
        this.put("I", "..");
        this.put("J", ".---");
        this.put("K", ".-.");
        this.put("L", ".-..");
        this.put("M", "--");
        this.put("N", "-.");
        this.put("O", "---");
        this.put("P", ".--.");
        this.put("Q", "--.-");
        this.put("R", ".-.");
        this.put("S", "...");
        this.put("T", "-");
        this.put("U", "..-");
        this.put("V", "...-");
        this.put("W", ".--");
        this.put("X", "-..-");
        this.put("Y", "-.--");
        this.put("Z", "--..");
        this.put("0", "-----");
        this.put("1", ".----");
        this.put("2", "..---");
        this.put("3", "...--");
        this.put("4", "....-");
        this.put("5", ".....");
        this.put("6", "-....");
        this.put("7", "--...");
        this.put("8", "---..");
        this.put("9", "----.");
        this.put(".", ".-.-.-");
        this.put(",", "--..--");
        this.put("?", "..--..");
        this.put(":", "---...");
        this.put("!", "-.-.---");
        this.put(";", "-.-.--");
        this.put("-", "-....-");
        this.put(" ", "/");

    }};

    public static void main(String[] args) {
        System.out.println("Insert the string you want to convert to morse code:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        stringToMorseConverter(string);
    }

    public static void stringToMorseConverter(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < string.length(); index++) {
            for (Map.Entry<String, String> item : map.entrySet()) {
                if (string.substring(index, index + 1).equalsIgnoreCase(item.getKey())) {
                    stringBuilder.append(item.getValue());
                    stringBuilder.append(" ");
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }

}
