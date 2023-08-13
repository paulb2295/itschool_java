package session5.homework;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        boolean wantsToStop = false;
        String userName = "Paul";
        String greeting = "Hello World!";
        Scanner scanner = new Scanner(System.in);
        String input;

        while (!wantsToStop) {
            label:
            while (true) {
                menuItems();
                input = scanner.nextLine();
                switch (input) {
                    case "1":
                        System.out.println();
                        System.out.println(greeting);
                        System.out.println();
                        break label;
                    case "2":
                        System.out.println();
                        System.out.println("Users Name is " + userName);
                        System.out.println();
                        break label;
                    case "0":
                        wantsToStop = true;
                        break label;
                    default:
                        System.out.println();
                        System.out.println("Invalid input!");
                        System.out.println();
                        break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }

    public static void menuItems() {
        System.out.println("Print \"Hello World!\" -> type 1 ");
        System.out.println("Print the users name -> type 2");
        System.out.println("Exit -> type 0");
    }
}
