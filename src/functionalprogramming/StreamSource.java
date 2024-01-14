package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {
        // Creating a stream from a collection
        List<String> names = Arrays.asList("Deya", "Bakhet", "Dubai");
        Stream<String> namesStream = names.stream();

        // Creating a Stream from an array
        String[] namesArray = {"Walnut", "Madarin", "Snow flake"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // Creating a stream using the Stream.itrerate() method
        Stream<Integer> infinteStream = Stream.iterate(0, n -> n + 1);

        // Creating a stream using the Stream generate() method
        Stream<Double> randomNumbersStream = Stream.generate(Math::random);
    }
}
