package session15.homework;

public class GenericClass<K, V> {

    private K key;
    private V value;

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public String toString() {
        return key + ": " + value;
    }
}

class GenericClassTest {

    public static void main(String[] args) {
        GenericClass<Character, Double> intPair = new GenericClass<>('A', 44.12);
        GenericClass<String, Integer> intStringPair = new GenericClass<>("Apple", 2);
        System.out.println(intPair);
        System.out.println(intStringPair);

    }
}
