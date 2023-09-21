package session16.homework;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface GenericItemList <G> {
     boolean isPresent ( List<G> list, G item);
}

class GenericItemInListTest{

    public static void main(String[] args) {

        GenericItemList<Object> genericItemList = (( list, itemToFind) ->{
            for ( Object item: list) {
                if(item.equals(itemToFind)){
                    return true;
                }
            }
            return false;
        });

        List<Object> list = Arrays.asList(1,"Paul", 2.89, 'c', 1989);
        System.out.println(genericItemList.isPresent(list,'c'));
    }
}
