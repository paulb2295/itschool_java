package session1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework1 {
    public static void main(String[] args) {
        String wantToExit = "no";
        while (wantToExit.equals("no")) {
            System.out.println("Choose Homework: 1 user details, " +
                    "2 varible types, " +
                    "3 Simple calculator (includes 4). ");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String option;
            try {
                option = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            switch (option) {
                case "1":
                    user("Borlea Paul", 28, "blue");
                    break;
                case "2":
                    variables();
                    break;
                case "3": {
                    double firstNumber;
                    double secondNumber;
                    String operation;
                    System.out.print("First number: ");
                    try {
                        firstNumber = Double.parseDouble(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();
                    System.out.println("Operation: Addition + , Subtraction - , Division / , Multiplication * , Modulus % ");
                    try {
                        operation = br.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();
                    System.out.print("Second number: ");
                    try {
                        secondNumber = Double.parseDouble(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " +
                            calculator(firstNumber, secondNumber, operation));
                    break;
                }
            }
            System.out.println("Do you wish to exit? Type yes. Type no to continue");
            try {
                wantToExit = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    // 1
    public static void user(String name, int age, String favoriteColor) {
        System.out.println("Hello, my name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My favorite color is " + favoriteColor);
    }

    //  2
    public static void variables() {
        int Integer = 345;
        double Double = 5609.896;
        char Character = 'c';
        String string = "String";
        System.out.println("An integer: " + Integer + "; A double: " + Double + "; A character: " + Character + "; A string: " + string);
    }

    // 3 + 4
    public static double calculator(double x, double y, String operation) {
        switch (operation) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "/":
                return x / y;
            case "*":
                return x * y;
            case "%":
                return (int) x % (int) y;
        }

        return -1;
    }

}