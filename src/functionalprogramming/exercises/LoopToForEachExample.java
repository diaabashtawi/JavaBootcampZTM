package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "java","python", "javascript", "php", "mysql"
        );
        for (String s : strings){
            System.out.println(s);
        }
        System.out.println("******************************");
        strings.forEach(s -> System.out.println(s));

    }
}
