package session8.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        printShoppingList(createShoppingList());
    }

    public static String[] createShoppingList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of items in your list:");
        int numberOfItems;
        try {
            numberOfItems = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("Invalid input. Shopping list will have 5 items.");
            numberOfItems = 5;
        }
        String[] shoppingList = new String[numberOfItems];
        scanner.nextLine();
        for (int index = 0; index < numberOfItems; index++) {
            System.out.println("Enter a item:");
            shoppingList[index] = scanner.nextLine();
        }
        return shoppingList;
    }

    public static void printShoppingList(String[] shoppingList) {
        System.out.print("Shopping list items: ");
        for (int index = 0; index < shoppingList.length; index++) {
            if (index != shoppingList.length - 1) {
                System.out.print(shoppingList[index] + ", ");
            } else {
                System.out.println(shoppingList[index] + ".");
            }
        }
    }
}
