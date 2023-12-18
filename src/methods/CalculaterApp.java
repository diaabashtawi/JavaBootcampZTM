package methods;

public class CalculaterApp {

    public static void main(String[] args) {
        int sum = Calculator.add(5, 8);
        System.out.println("Sum : " + sum);
    }
}

class Calculator{
    public static int add(int a, int b){
        return a + b;
    }
}
