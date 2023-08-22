package session8.practice;

public class WrapperClass {

    public static void main(String[] args) {

        int number = 10;
        Integer number2 = Integer.valueOf(number);

        String randomNumber = "12";
        Integer rendomNumberAsInteger = Integer.parseInt(randomNumber);

        printNumber("23.46");
    }

    public static void printNumber(String number) {
        Double doubleNumber = Double.parseDouble(number);
        long rounderNumber = Math.round(doubleNumber);
        System.out.println(rounderNumber);
    }
}
