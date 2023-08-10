package session4.homework;

public class FactorialCalculator {

    public static void main(String[] args) {

        int number = 9;
        long factorial = 1;

        for (int counter = 1; counter <= number; counter++) {
            factorial *= counter;
        }

        System.out.println(number + "! = " + factorial);
        System.out.println("Recursive factorial: " + recursiveFactorial(9));
    }

    public static long recursiveFactorial(int number) {

        if (number == 1) return 1;
        else return number * recursiveFactorial(number - 1);
    }
}
