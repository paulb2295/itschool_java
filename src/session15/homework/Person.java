package session15.homework;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(this.getName(), person.getName()) && this.getAge() == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }
}

class PersonTest {

    public static void main(String[] args) {

        Person personOne = new Person();
        personOne.setName("Paul");
        personOne.setAge(28);
        personOne.setEmail("bp@yahoo.com");

        Person personTwo = new Person();
        personTwo.setName("Paul");
        personTwo.setAge(28);
        personTwo.setEmail("pb@gmail.com");

        System.out.println("personOne is the same as personTwo: " + personOne.equals(personTwo));

        System.out.println(personOne.hashCode());
        System.out.println(personTwo.hashCode());
    }
}
