package functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPipeLineExample {
    public static void main(String[] args) {

        // Example 1: Filtering and collecting a list of names
        List<String> names = Arrays.asList(
                "Walnut",
                "Mandarin",
                "Snowflake",
                "Bobby",
                "Roxy"
        );
        List<String> namesStartingWithB = names.stream()
                .filter(s -> s.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(namesStartingWithB);

        // Example 2: Finding the longest name
        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestName);

        // Example 3: Transforming a list of strings into a set of integers
        Set<Integer> uniqueIntegers = names.stream()
                .map(String::length)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(uniqueIntegers);

        // Example 4: Concatenating Strings with a custom separator
        String concatenatedNames = names.stream().collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);


    }
}
