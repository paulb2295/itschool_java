package session4.homework;

public class TriangleType {

    public static void main(String[] args) {

        int sideOne = 10;
        int sideTwo = 10;
        int sideThree = 11;

        if ((sideOne == sideTwo) && (sideTwo == sideThree)) {
            System.out.println("Eqilateral Triangle");
        } else if ((sideOne == sideTwo) || (sideTwo == sideThree) || (sideThree == sideOne)) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}
