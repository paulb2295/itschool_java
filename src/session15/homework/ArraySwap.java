package session15.homework;

public class ArraySwap {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 6.7, 2.55, 10.09};
        String[] stringArray = {"Apple", "Plum", "Orange", "Cherry"};
        Character[] charArray = {'A', 'B', 'C', 'Z'};

        swapArrayElements(intArray);
        swapArrayElements(doubleArray);
        swapArrayElements(stringArray);
        swapArrayElements(charArray);

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(charArray);
    }

    public static <E> void swapArrayElements(E[] array) {
        E buffer;
        buffer = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = buffer;
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
