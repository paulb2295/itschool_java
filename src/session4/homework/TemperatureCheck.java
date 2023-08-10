package session4.homework;

public class TemperatureCheck {

    public static void main(String[] args) {

        int temperature = 20;

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature < 20) {
            System.out.println("Cold");
        } else {
            System.out.println("Warm");
        }
    }
}
