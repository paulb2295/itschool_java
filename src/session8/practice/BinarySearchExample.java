package session8.practice;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] array = {23, 7, 90, 4, 5, 12, 0, 16};
        int result = binarySearch(array, 23);
        if (result != -1) {
            System.out.println("Target found at position " + result);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int binarySearch(int[] inputArray, int item) {
        Arrays.sort(inputArray);
        int left = 0;
        int right = inputArray.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (inputArray[middle] == item) {
                return middle;
            } else if (inputArray[middle] > item) {
                right = middle - 1;
            } else if (inputArray[middle] < item) {
                left = middle + 1;
            }
        }
        return -1;
    }
}
