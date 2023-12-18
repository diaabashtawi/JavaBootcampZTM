package methods;

public class AdvancedCalcuator {
    public static void performCalculations(int a, int b){
        int sum = a + b;
        int differance = a - b;
        int product = a  * b;
        double quotient = (double) a / b;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + differance);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
    }
}

class MainApp{
    public static void main(String[] args) {
        AdvancedCalcuator.performCalculations(12, 4);
    }
}
