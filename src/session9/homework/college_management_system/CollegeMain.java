package session9.homework.college_management_system;

import java.time.LocalDate;

public class CollegeMain {

    public static void main(String[] args) {

        Professor prof = new Professor("Ana", "Popa", 'f', 29, LocalDate.of(1994, 1, 1), "29456437283", "Arad");
        Course biology = new Course("Biology", "Monday 10:00-12:00", 120, "Human Anatomy", prof);

        System.out.println(biology);

        Course math = new Course("Math", "Friday 08:00-12:00", 240, "Calculus");
        Professor prof2 = new Professor("Mihai", "Popescu", 'm', 49, LocalDate.of(1974, 1, 1), "174635262783344", "Timisoara");
        math.setAssignedProfessor(prof2);
        System.out.println(math);

        Course computerScience = new Course("Computer Science", "Monday-Fryday 12:00-16:00", 240, "DSA");
        Professor prof3 = new Professor("Mirel", "Pop", 'm', 55, LocalDate.of(1966, 1, 1), "174635262783344", "Timisoara");
        computerScience.setAssignedProfessor(prof3);
        System.out.println(computerScience);


        Professor prof4 = new Professor("Maria", "Pop", 'f', 59, LocalDate.of(1960, 1, 1), "26056437283", "Arad");
        Course physics = new Course("Physics", "Monday 10:00-12:00", 120, "Optics", prof4);
        System.out.println(physics);


    }


}
