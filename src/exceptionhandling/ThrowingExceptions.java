package exceptionhandling;

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
        divide(1, 0);
    }

    public static void divide(int a, int b){
        if (b == 0){
            throw  new ArithmeticException("Cannot divide by Zero");
        }
        System.out.println(a / b);
    }

    public static void validateNumber(int number){
        if (number < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }
}
