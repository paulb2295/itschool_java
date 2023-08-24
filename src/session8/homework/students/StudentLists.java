package session8.homework.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentLists {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mary", 8.22));
        studentList.add(new Student("John", 5.34));
        studentList.add(new Student("Charles", 4.23));
        studentList.add(new Student("Alex", 9.6));
        studentList.add(new Student("Michael", 4.56));
        studentList.add(new Student("Jane", 4.8));
        studentList.add(new Student("Sarah", 10));
        studentList.add(new Student("Johana", 4.99));
        studentList.add(new Student("Mark", 6.65));
        studentList.add(new Student("Jake", 5.89));

        printGraduateStudentList(getGraduateStudentList(studentList));
    }


    public static List getGraduateStudentList(List<Student> studentList) {
        List<Student> graduateStudentList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.hasGraduated()) {
                graduateStudentList.add(student);
            }
        }
        return graduateStudentList;
    }

    public static void printGraduateStudentList(List<Student> graduateStudentList) {
        System.out.println("Graduate student list: ");
        for (Student student : graduateStudentList) {
            System.out.println(student.getName() + " graduated with " + student.getGrade());
        }
    }


}
