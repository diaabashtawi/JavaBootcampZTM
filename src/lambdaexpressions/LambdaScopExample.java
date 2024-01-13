package lambdaexpressions;

public class LambdaScopExample {
    public static void main(String[] args) {
        int localVar = 6;
        Calculater calculater = (a, b) -> a * b + localVar;
        int result = calculater.calculate(3, 5);
        System.out.println(result);
    }
}
