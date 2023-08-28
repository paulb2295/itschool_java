package session9.homework.college_management_system;

import java.time.LocalDate;

public class Professor extends Person {
    public Professor(String lastName, String firstName, char sex, int age, LocalDate dateOfBirth, String CNP, String address) {
        super(lastName, firstName, sex, age, dateOfBirth, CNP, address);
    }

    public Professor() {
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
