package session5.homework;

public class First10FibonacciNumbers {
    public static void main(String[] args) {

        int[] fibonacciSeries = new int[10];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int index = 2; index < 10; index++) {
            fibonacciSeries[index] = fibonacciSeries[index - 1] + fibonacciSeries[index - 2];
        }

        for (int index = 0; index < 10; index++) {
            System.out.println(fibonacciSeries[index]);
        }
    }
}
