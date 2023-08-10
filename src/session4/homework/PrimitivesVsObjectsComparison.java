package session4.homework;

public class PrimitivesVsObjectsComparison {

    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 5;
        String stringOne = "A string";
        String stringTwo = "A string";

        if (firstNumber == secondNumber) {
            System.out.println("First number is equal to the second number");
        } else {
            System.out.println("First number is not equal to the second number");
        }

        if (stringOne.equals(stringTwo)) {
            System.out.println("stringOne and stringTwo are the same");
        } else {
            System.out.println("stringOne and StringTwo are different");
        }
    }
}
