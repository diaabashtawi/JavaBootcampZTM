package functionalprogramming;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferences {
    public static void main(String[] args) {

        Function<Integer, String> numberToHexString = i -> Integer.toHexString(i);
        Function<Integer, String> numberToHexStringMethodReferance = Integer::toHexString;
        System.out.println(numberToHexStringMethodReferance.apply(256));
        System.out.println("--------------------------------------------------------");
        String prefix = "Welcome";
        Function<String, String> greet = s -> prefix + s;
        Function<String, String> greetMethodReferance = prefix::concat;
        System.out.println(greetMethodReferance.apply(" Deya Bakheet"));
        System.out.println("---------------------------------------------------------");
        BiFunction<String, String, Integer> stringComparator = (s1, s2) ->s1.compareToIgnoreCase(s2);
        BiFunction<String, String, Integer> stringComparatorMethodReferance = String::compareToIgnoreCase;
        System.out.println(stringComparatorMethodReferance.apply("Deya", "deya"));
        System.out.println("---------------------------------------------------------");
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = listSupplier.get();
        names.add("Deya Bakheet");
        System.out.println(names.get(0));

    }
}
