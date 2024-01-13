package lambdaexpressions.exercises;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator addition = (a, b) -> a + b;
        int sum = addition.operate(5, 3);
        System.out.println("Sum is : " + sum);
        System.out.println("--------------------------------");
        NumericOperator maximum = (a, b) -> (a > b) ? a : b;
        int max = maximum.operate(5,3);
        System.out.println("Max : " + max);
        System.out.println("--------------------------------");
        StringFormatter toUpperCase = input -> input.toUpperCase();
        String upperCaseString = toUpperCase.format("deyabakheet");
        System.out.println("Uppercase : " + upperCaseString);
    }
}
