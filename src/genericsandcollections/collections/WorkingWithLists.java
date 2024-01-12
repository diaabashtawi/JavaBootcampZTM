package genericsandcollections.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("pasta");
        shoppingList.add("bananas");
        shoppingList.add("iphone 13 case");
        shoppingList.add("water");
        System.out.println(shoppingList);
        System.out.println(shoppingList.get(1));
        shoppingList.remove("pasta");
        System.out.println(shoppingList);
        boolean containsBananas = shoppingList.contains("bananas");
        System.out.println(containsBananas);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        
    }
}
