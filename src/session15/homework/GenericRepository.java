package session15.homework;

import java.util.HashMap;
import java.util.Map;

public class GenericRepository {
    private Map<String, GenericObject<?>> repo = new HashMap<String, GenericObject<?>>();

    public void addObject(String name, GenericObject<?> object) {
        if (!repo.containsValue(object)) {
            repo.put(name, object);
        }
    }

    public void printRepo() {
        for (Map.Entry<String, GenericObject<?>> object : repo.entrySet()) {
            System.out.println(object.getKey() + ": " + object.getValue());
        }
    }


}

class GenericObject<O> {
    private O data;

    GenericObject(O data) {
        this.data = data;
    }

    public O getData() {
        return data;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        GenericObject<?> compareObject = (GenericObject<?>) object;
        return data != null ? data.equals(compareObject.data) : compareObject.data == null;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}


class GenericTest {

    public static void main(String[] args) {
        GenericRepository repo = new GenericRepository();
        GenericObject<Integer> intObject = new GenericObject<>(12);
        GenericObject<Integer> secondIntObject = new GenericObject<>(12);
        GenericObject<Double> doubleObject = new GenericObject<>(33.90);
        GenericObject<String> stringObject = new GenericObject<>("Something");
        GenericObject<Character> charObject = new GenericObject<>('B');

        repo.addObject("Integer ", intObject);
        repo.addObject("Another int", secondIntObject); // will not be inserted
        repo.addObject("Double ", doubleObject);
        repo.addObject("String ", stringObject);
        repo.addObject("Character", charObject);
        repo.printRepo();
    }
}
