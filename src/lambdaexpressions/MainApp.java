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
        System.out.println("-----------------------------------");
        NumberProvider n1 = ()->1024;
        System.out.println(n1.provide());
        System.out.println("-----------------------------------");
        int result1 = execute(3, 5, c1);
        int result2 = execute(3, 5, c2);
        int result3 = execute(3, 5, c3);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }

    public static int execute(int num1, int num2, Calculater calculater){
        return calculater.calculate(num1, num2);
    }
}
