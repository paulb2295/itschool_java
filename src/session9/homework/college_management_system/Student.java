package session9.homework.college_management_system;

import java.time.LocalDate;

public class Student extends Person {
    public Student(String lastName, String firstName, char sex, int age, LocalDate dateOfBirth, String CNP, String address) {
        super(lastName, firstName, sex, age, dateOfBirth, CNP, address);
    }

    public Student() {
    }


}
