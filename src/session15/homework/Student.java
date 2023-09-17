package session15.homework;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int studentId;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(this.name, student.name) && this.getAge() == student.getAge() && Objects.equals(this.getEmail(), student.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAge(), this.getName(), this.getEmail());
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.setName("Marry");
        studentOne.setAge(22);
        studentOne.setStudentId(12341);
        studentOne.setEmail("marry@gmail.com");

        Student studentTwo = new Student();
        studentTwo.setName("Marry");
        studentTwo.setAge(22);
        studentTwo.setStudentId(124098);
        studentTwo.setEmail("marry@gmail.com");

        System.out.println("studentOne is the same as studentTwo: " + studentOne.equals(studentTwo));
        System.out.println(studentTwo.hashCode());
        System.out.println(studentOne.hashCode());
    }
}