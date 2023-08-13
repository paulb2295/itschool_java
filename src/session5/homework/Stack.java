package session5.homework;

public class Stack {
    private final char[] array;
    private int top;
    private final int capacity;

    Stack(int size) {
        array = new char[size];
        capacity = size;
        top = -1;
    }

    public void pushElementIntoStack(char x) {
        if (stackIsFull()) {
            System.out.println("Stack Overflow!");
            System.exit(1);
        }
        array[++top] = x;
    }

    public char popElementFromStack() {
        if (stackIsEmpty()) {
            System.out.println("Empty Stack");
            System.exit(1);
        }
        return array[top--];
    }

    public int stackSize() {
        return top + 1;
    }

    public Boolean stackIsEmpty() {
        return top == -1;
    }

    public Boolean stackIsFull() {
        return top == capacity - 1;
    }

    public int getTop() {
        return top;
    }

    public void printStack() {
        for (int index = 0; index <= top; index++) {
            System.out.println(array[index]);
        }
    }

}