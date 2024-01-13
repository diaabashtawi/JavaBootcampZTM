package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuiltInFunctionInterfaces {

    public static void main(String[] args) {
        SupplierExample se = new SupplierExample();
        se.get();

        Supplier<String> s1 = () ->"Welcome From Main Method";

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Welcome from Consumer");

        Predicate<String> p1 = s -> s.length() < 5;
        System.out.println(p1.test("Deya Bakheet"));

        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Welcome"));

    }
}
