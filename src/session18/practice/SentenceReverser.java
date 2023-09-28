package session18.practice;

public class SentenceReverser {

    public static void main(String[] args) {

        String sentence = "Around the world, around the world";
        System.out.println(reversedSentence(sentence));
    }

    private static String reversedSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = words.length - 1; index > 0; index--) {
            stringBuilder.append(words[index] + " ");
        }
        stringBuilder.append(words[0]);
        return stringBuilder.toString();
    }
}
