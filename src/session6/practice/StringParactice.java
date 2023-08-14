package session6.practice;

public class StringParactice {

    public static void main(String[] args) {

        String animal1 = "lion";
        String animal2 = new String("lion");
        String animal3 = "lion";
        String name = "AdrianPuscuta";
        String sentence = "   I like to eat apple pie. ";

        System.out.println(animal1 == animal2);
        System.out.println(animal1 == animal3);

        System.out.println("anima1 hashcode: " + Integer.toHexString(System.identityHashCode(animal1)));
        System.out.println("anima2 hashcode: " + Integer.toHexString(System.identityHashCode(animal2)));
        System.out.println("anima3 hashcode: " + Integer.toHexString(System.identityHashCode(animal3)));

        User user = new User();
        user.setName("Paul");
        // objects are mutable
        user = new User(); // echivalent la cand dai val noua la un string gen animal1 = "deer";

        garbageCollectorExample();
        stringConcat();

        System.out.println(getStringLength(animal1));
        System.out.println(getCharAt(animal1, 3));

        System.out.println(animal1.indexOf("i"));

        System.out.println(name.substring(6));
        System.out.println(name.substring(name.indexOf("P")));
        System.out.println(name.substring(5, 7));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //System.out.println(name.charAt(0).toUpperCase); doesn't work

        System.out.println(getStringStartsWith(name, "Adrian"));
        System.out.println(getStringEndsWith(name, "Puscuta"));
        System.out.println(sentence.contains("apple"));


        System.out.println(sentence.replace('a', 'b'));
        System.out.println(sentence.trim());
        System.out.println(sentence);

    }

    public static void garbageCollectorExample() {
        String name = "Andrei";
        System.out.println(name);

        name = "Ion";
        System.out.println(name);
    }

    public static void stringConcat() {
        String value1 = "Adrian";
        String value2 = "Puscuta";
        System.out.println("value1 hashcode before: " + Integer.toHexString(System.identityHashCode(value1)));

        value1 = value1.concat(value2);
        System.out.println("value1 hashcode after: " + Integer.toHexString(System.identityHashCode(value1)));
    }

    public static int getStringLength(String input) {
        return input.length();
    }

    public static char getCharAt(String input, int index) {
        return input.charAt(index);
    }

    public static boolean getStringStartsWith(String input, String statsWith) {
        return input.startsWith(statsWith);
    }

    public static boolean getStringEndsWith(String input, String endsWith) {
        return input.endsWith(endsWith);
    }
}
