package session4.practice;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthday = 2009;
        int age = currentYear - birthday;
        System.out.println("Age is: " + age);

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        int number = -15;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0.");
        }

        printName();
        printDistinction();
    }

    public static void printName() {
        String name = "Ioana";
        String city = "Cluj";
        String sex = "F";
        int age = 20;

        if (city.equals("Cluj")) {
            if (sex.equals("F")) {
                if (age == 20) {
                    System.out.println(name);
                }
            }
        }

        if ((city.equals("Cluj") || city.equals("Bucuresti")) && sex.equals("F") && age == 20) {
            System.out.println(name);
        }
    }

    public static void printDistinction() {
        int mark = 70;
        if (mark >= 85) {
            System.out.println("Distinction");
        } else if (mark > 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
}
