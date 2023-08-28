package session9.homework.college_management_system;

import java.time.LocalDate;

public class Person {

    private String lastName;
    private String firstName;
    private char sex;
    private int age;
    private LocalDate dateOfBirth;
    private String CNP;
    private String Address;

    public Person(String lastName, String firstName, char sex, int age, LocalDate dateOfBirth, String CNP, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        Address = address;
    }

    public Person() {
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
