package session7.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        printUserInfo();
    }

    public static void printUserInfo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor name:");
        String string = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Are you a student? true/false");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("User: " + string + ", age " +age +", student " + isStudent);

        scanner.close();
    }
}
