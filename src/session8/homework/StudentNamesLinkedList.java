package session8.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentNamesLinkedList {

    public static void main(String... args) {

        List<String> studentList = new LinkedList<>();
        studentList.add("Charles");
        studentList.add("Michael");
        studentList.add("Michael");
        studentList.add("Sarah");
        studentList.add("Alex");
        studentList.add("Mary");
        studentList.add("Mary");
        studentList.add("John");
        studentList.add("David");
        studentList.add("Charles");

        try {
            deleteItemV1(studentList);
        }catch (Exception exception){
            System.out.println("deleteItemV1 throws " + exception);
        }

        deleteItemV2(studentList);

        deleteItemV3(studentList);

        System.out.println("List after deletion: " + studentList);

    }

    public static void deleteItemV1(List<String> studentList) { // throws ConcurrentModificationException
        Scanner scanner = new Scanner(System.in);
        boolean hasRemoved = false;
        System.out.println("Enter the name of the student you want to delete from the list:");
        String name = scanner.nextLine();
        for (String student : studentList) { //enhanced for throws ConcurrentModificationException if you don't break after FIRST deletion
            if (name.equalsIgnoreCase(student)) {
                studentList.remove(student);
                hasRemoved = true;
                //break; -> if you don't want exception thrown. It will only delete the first appearance of the name
            }
        }
        if (hasRemoved) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("The student doesn't exist!");
        }
    }

    public static void deleteItemV2(List<String> studentList) { // does not throw exception
        Scanner scanner = new Scanner(System.in);
        boolean hasRemoved = false;
        System.out.println("Enter the name of the student you want to delete from the list:");
        String name = scanner.nextLine();
        for (int index = 0; index < studentList.size(); index++) {
            if (name.equalsIgnoreCase(studentList.get(index))) {
                studentList.remove(studentList.get(index));
                hasRemoved = true;
            }
        }
        if (hasRemoved) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("The student doesn't exist!");
        }
    }


    public static void deleteItemV3(List<String> studentList) { // does NOT throw exception
        Scanner scanner = new Scanner(System.in);
        boolean hasRemoved = false;
        System.out.println("Enter the name of the student you want to delete from the list:");
        String name = scanner.nextLine();
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            if (name.equalsIgnoreCase(student)) {
                iterator.remove();
                hasRemoved = true;
            }
        }
        if (hasRemoved) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("The student doesn't exist!");
        }
    }


}
