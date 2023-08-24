package session8.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChristmasWishlist {

    public static void main(String[] args) {

        printWishList(createWishList());
    }

    public static List createWishList() {
        Scanner scanner = new Scanner(System.in);
        List<String> wishList = new ArrayList<>();
        StringBuilder wishItem = new StringBuilder();
        System.out.println("Enter exit to end insert.");
        do {
            System.out.println("Enter a item in wish list:");
            wishItem.append(scanner.nextLine());
            if (!wishItem.toString().equalsIgnoreCase("exit")) {
                wishList.add(wishItem.toString());
                wishItem.delete(0, wishItem.length());
            } else {
                break;
            }
        } while (true);
        return wishList;
    }

    public static void printWishList(List<String> wishList) {
        System.out.print("Christmas wish list: ");
        for (String item : wishList) {
            if (wishList.indexOf(item) != wishList.size() - 1) {
                System.out.print(item + ", ");
            } else {
                System.out.println(item + ".");
            }
        }
    }
}
