package session8.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityArrayList {

    public static void main(String[] args) {

        List<String> cityArray = new ArrayList<>();
        cityArray.add("Los Angeles");
        cityArray.add("Los Alamos");
        cityArray.add("Boston");
        cityArray.add("New York");
        cityArray.add("Dallas");

        addCity(cityArray);
        System.out.println("City array:" + cityArray);
    }

    public static void addCity(List<String> cityArray) {
        Scanner scanner = new Scanner(System.in);
        boolean isRepresented = false;
        System.out.println("Insert a city into the array");
        String newCity = scanner.nextLine();
        for (String city : cityArray) {
            if (city.equalsIgnoreCase(newCity)) {
                isRepresented = true;
                break;
            }
        }
        if (!isRepresented) {
            cityArray.add(newCity);
        } else {
            System.out.println("You entered a duplicate city.");
        }
    }
}
