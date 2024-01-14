package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "java","python", "javascript", "php", "mysql"
        );
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Strings : " + upperCaseStrings);
    }
}
