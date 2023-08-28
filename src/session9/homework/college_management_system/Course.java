package session9.homework.college_management_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String schedule;
    private int durationMinutes;
    private String description;
    private Professor assignedProfessor;


    public Course(String name, String schedule, int durationMinutes, String description, Professor assignedProfessor) {
        this.name = name;
        this.schedule = schedule;
        this.durationMinutes = durationMinutes;
        this.description = description;
        this.assignedProfessor = assignedProfessor;
    }

    public Course(String name, String schedule, int durationMinutes, String description) {
        this.name = name;
        this.schedule = schedule;
        this.durationMinutes = durationMinutes;
        this.description = description;
    }

    public Course() {
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getAssignedProfessor() {
        return assignedProfessor;
    }

    public void setAssignedProfessor(Professor assignedProfessor) {
        this.assignedProfessor = assignedProfessor;
    }

    @Override
    public String toString() {
        return "Course: " + name +
                "\nSchedule: " + schedule +
                "\nDuration in minutes: " + durationMinutes +
                "\nDescription: " + description +
                "\nAssigned Professor: " + assignedProfessor +
                "\n---------------------------------------------";
    }
}
