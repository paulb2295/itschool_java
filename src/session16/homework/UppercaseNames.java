package session16.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface UppercaseNames {
    List<String> uppercaseNamesFilter (List<String> names);
}

class UppercaseNamesFilterTest{

    public static void main(String[] args) {

        UppercaseNames uppercaseNames = (list -> {
           List<String> uppercaseNamesList = new ArrayList<>();
            for (String name: list) {
                if (name.equals(name.toUpperCase())){
                    uppercaseNamesList.add(name);
                }
            }
            return uppercaseNamesList;
        });

        List<String> names = Arrays.asList("Marry", "victor", "MIKE", "PAUL");
        System.out.println(uppercaseNames.uppercaseNamesFilter(names));
    }
}
