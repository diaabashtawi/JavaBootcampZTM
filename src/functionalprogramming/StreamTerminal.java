package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Deya", "Bakheet", "Dubai");
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

        long numberOfItems = names.stream().count();
        System.out.println("Number of Items in the list using stream count method : " + numberOfItems);

        // min, max : return the minimum and maximum elements in the stream
        Optional<String> min = names.stream().min((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(min.get());

        // allMatch : check if all of the elements in the stream match a given predicate
        boolean allBiggerThanFive = names.stream().allMatch(s -> s.length() > 5);
        System.out.println("all Bigger Than Five : " + allBiggerThanFive);

        // anyMatch : check if any of the elements in the stream match a given predicate
        boolean anyBiggerThanFive = names.stream().anyMatch(s -> s.length() > 5);
        System.out.println("Any Bigger Than Five : " + anyBiggerThanFive);

        // noneMatch: check if none of the elements in the stream match a given predicate
        boolean noneBiggerThanFive = names.stream().noneMatch(s->s.length() > 5);
        System.out.println("None Bigger Than Five : " + noneBiggerThanFive);

        // collect : transform the stream into a different data structure, such as a List, Set, or Map.
        List<String> namesList = names.stream().collect(Collectors.toList());

        // reduce : applies a binary operator to the elements in the stream, reducing them to a single value.
        Optional<String> totalString = names.stream().reduce(String::concat);
        System.out.println(totalString.get());
    }
}
