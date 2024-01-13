package genericsandcollections.collections;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("Deya", 31);
        nameAgesMap.put("Maria", 32);
        nameAgesMap.put("Lola", 25);
        System.out.println(nameAgesMap);
//        System.out.println(nameAgesMap.get("Deya"));

        for (Integer i : nameAgesMap.values()){
            System.out.println(i);
        }
        System.out.println("*********************************");
        for (String k : nameAgesMap.keySet()){
            System.out.println(k);
        }
        System.out.println("*********************************");
        for (Map.Entry<String, Integer> entry : nameAgesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        nameAgesMap.remove("Deya");
        nameAgesMap.put("Maria", 35);
        System.out.println("*********************************");
        System.out.println(nameAgesMap);

    }
}
