package session17.homework;

import java.util.Arrays;
import java.util.List;

public class Person {

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " years old.";
    }
}

class PersonTest {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
        System.out.println(majorFilter(people));
    }

    private static List<Person> majorFilter(List<Person> input) {
        List<Person> output = input.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();
        return output;
    }
}
