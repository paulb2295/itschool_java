package session6.homework.IntegerToRomanConvertor;

import java.util.*;

public class IntegerToRoman {

    public static final int MAXROMANNUMERAL = 3999;

    public static void main(String[] args) {

        printRomanNumber(NumberToQueue());

    }

    public static ArrayList NumberToQueue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number you want to convert to roman number:");
        int number = scanner.nextInt();
        ArrayList<Queue<Integer>> arrayOfQueues = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        if (number <= MAXROMANNUMERAL) {
            queueInserter(queue, number);
            arrayOfQueues.add(queue);
        } else if (number > MAXROMANNUMERAL) {
            ArrayList<Integer> overflowArray = new ArrayList<>();
            maxValueOverflowRectifier(number, overflowArray);
            for (int overflowNumber : overflowArray) {
                Queue<Integer> overflowQueue = new LinkedList<>();
                queueInserter(overflowQueue, overflowNumber);
                arrayOfQueues.add(overflowQueue);
            }
        }
        scanner.close();
        return arrayOfQueues;
    }

    public static ArrayList maxValueOverflowRectifier(int number, ArrayList<Integer> overflowArray) {
        if (number < MAXROMANNUMERAL) {
            overflowArray.add(number);
            return overflowArray;
        } else {
            number -= MAXROMANNUMERAL;
            overflowArray.add(MAXROMANNUMERAL);
            return maxValueOverflowRectifier(number, overflowArray);
        }
    }

    public static void queueInserter(Queue<Integer> queue, int number) {
        String buffer = String.valueOf(number);
        for (int queueIndex = 0; queueIndex < buffer.length(); queueIndex++) {
            queue.add(Character.getNumericValue(buffer.charAt(queueIndex)));
        }
    }

    public static String romanNumberCreator(Queue<Integer> queue) {
        StringBuilder romanNumber = new StringBuilder();
        for (int index = queue.size() - 1; index >= 0; index--) {
            IntDigit intDigit = new IntDigit(queue.remove(), index);
            romanNumber.append(intDigit.returnRomanDigit());
        }
        return romanNumber.toString();
    }

    public static void printRomanNumber(ArrayList<Queue<Integer>> arrayOfQueues) {
        if (arrayOfQueues.size() > 1) {
            System.out.println("Max integer that can be represented with roman numbers exceeded!");
            System.out.println("The number will be split in 3999 and remainder!");
            for (Queue queueInArray : arrayOfQueues) {
                System.out.println(romanNumberCreator(queueInArray));
            }
        } else if (arrayOfQueues.size() == 1) {
            System.out.println(romanNumberCreator(arrayOfQueues.get(0)));
        }
    }

}
