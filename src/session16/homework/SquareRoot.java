package session16.homework;
@FunctionalInterface
public interface SquareRoot {
    double squareRootCalculator(double number);
}

class SquareRootTest{

    public static void main(String[] args) {

        SquareRoot squareRoot = number -> Math.sqrt(number);

        System.out.println(squareRoot.squareRootCalculator(36));
    }
}
