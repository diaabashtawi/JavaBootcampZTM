package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "java","python", "javascript", "php", "mysql"
        );
        List<String> result = strings.stream()
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered and transformed strings : " + result);

    }
}
