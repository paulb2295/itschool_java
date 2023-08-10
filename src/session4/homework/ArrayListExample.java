package session4.homework;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<String>();
        ArrayList<String> listTwo = new ArrayList<String>();

        listOne.add("Iphone");
        listOne.add("Samsung");
        listOne.add("LG");
        listOne.add("Huawei");
        listOne.add("HTC");
        /*
        for (int counter = 0; counter < listOne.size(); counter++) {
            listTwo.add(listOne.get(counter));
        }
         */
        listTwo = listOne;
        listOne.add("Sony");

        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);

    }
}
