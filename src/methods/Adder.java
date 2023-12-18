package methods;

public class Adder {
    public static void main(String[] args) {
        add(1024, 1024);
    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}
