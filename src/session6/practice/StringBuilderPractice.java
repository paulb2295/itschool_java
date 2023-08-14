package session6.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {

        String result = " ";
        System.out.println(result.isEmpty());
        System.out.println(result.trim().isEmpty());

        for (int index = 0; index < 10; index++) {
            result += 'a';
        }

        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("a");
        }
        String result2 = stringBuilder.toString();
        System.out.println(stringBuilder);
    }
}
