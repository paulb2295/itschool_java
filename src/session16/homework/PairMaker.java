package session16.homework;

@FunctionalInterface
public interface PairMaker<T, U> {
    void setValues(Pair pair, T valueOne, U valueTwo);
}

class Pair<T, U> {
    private T valueOne;
    private U valueTwo;

    public void setValueOne(T valueOne) {
        this.valueOne = valueOne;
    }

    public void setValueTwo(U valueTwo) {
        this.valueTwo = valueTwo;
    }

    @Override
    public String toString() {
        return valueOne + " " + valueTwo;
    }
}

class PairTest {

    public static void main(String[] args) {
        PairMaker pairMaker = ((pair, valueOne, valueTwo) -> {
            pair.setValueOne(valueOne);
            pair.setValueTwo(valueTwo);
        });

        Pair pair = new Pair();
        Pair pair1 = new Pair();
        pairMaker.setValues(pair, "Age:", 83);
        pairMaker.setValues(pair1, 23, 34);
        System.out.println(pair);
        System.out.println(pair1);

    }
}
