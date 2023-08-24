package session8.homework.students;

public class Student {
    private final String name;
    private final double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public boolean hasGraduated() {
        return grade >= 5;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

