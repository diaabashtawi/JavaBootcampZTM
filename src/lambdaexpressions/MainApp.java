package lambdaexpressions;

public class MainApp {
    public static void main(String[] args) {
        Calculater c1 = (x, y) -> x + y;
        Calculater c2 = (x, y) -> x - y;

        System.out.println(c1.calculate(3, 5));
        System.out.println(c2.calculate(3, 5));
        Calculater c3 = (x, y) -> {
            System.out.println("Hello from the lambda expression : ");
            return x * y;
        };
        System.out.println(c3.calculate(3, 5));
        System.out.println("-----------------------------------");
        Printer p1 = s -> System.out.println("Printer says : " + s);
        p1.print("Hi, Deya Bakheet");
    }
}
