package session16.homework;

@FunctionalInterface
interface StringConcatenate {
    String stringConcat(String stringOne, String stringTwo);
}

class StringConcatenateTest {

    public static void main(String[] args) {

        StringConcatenate stringConcatenate = ((stringOne, stringTwo) -> stringOne + " " + stringTwo);

        String stringOne = "Mark";
        String stringTwo = "Green";
        System.out.println(stringConcatenate.stringConcat(stringOne,stringTwo));
    }
}
