package session8.homework;

import java.util.Scanner;

public class MoviesLinearSearch {

    public static void main(String[] args) {

        String[] movieTitles = {"Men in black",
                "Jurassic World",
                "IT",
                "Titanic",
                "Avatar",
                "Taken"};

        linearSearch(movieTitles);
    }


    public static void linearSearch(String[] movieTitles) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter movie title:");
        String title = scanner.nextLine();
        for (int index = 0; index < movieTitles.length; index++) {
            if (title.equalsIgnoreCase(movieTitles[index])) {
                System.out.println("Movie found on index: " + index);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(title + " is not present in movie list!");
        }
    }
}
