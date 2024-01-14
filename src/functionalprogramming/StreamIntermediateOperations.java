package functionalprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Walnut",
                "Mandarin",
                "Snowflake",
                "Bobby",
                "Roxy"
        );

        // filter: filters the Stream based on a predicate
        Stream<String> namesStartingWithB = names.stream().filter(name ->name.startsWith("B"));

        // map: applies a function to each element in the stream
        Stream<Integer> namesLengths = names.stream().map(String::length);

        // flatMap: applies a function to each element in the stream and flattens the resulting stream into a single stream
        List<List<String>> nestedNames = Arrays.asList(
                Arrays.asList("Bobby", "Django"),
                Arrays.asList("Mandarin", "Walnut", "Snowflake")
        );

        // peek :performs an action on each element in the stream without modifying the stream
        Stream<String> namesWithPeek = names.stream().peek(System.out::println);

        // limit: limits the stream to a certain number of elements
        Stream<String> firstThreeNames = names.stream().limit(3);

        // skip : skips the first n element in the stream
        Stream<String> namesWithoutFirstTwo = names.stream().skip(2);

        // distinct : remove duplicate elements from the stream
        Stream<String> distinctNames = names.stream().distinct();

        // sorted : sorts the elements in the stream according to a comparator
        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder());

    }
}
