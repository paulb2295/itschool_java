package session4.homework;

public class StringObjectsMemoryReference {

    public static void main(String[] args) {

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        if (stringOne == stringTwo) {
            System.out.println("Both strings refer to the same object");
        } else {
            System.out.println("The strings don't refer tot the same object");
        }
    }
}
