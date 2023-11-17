package variables;

public class ExampleOfOperators {

    public static void main(String[] args) {
        // Arithmetic operators
        System.out.println("----------------Arithmetic operators---------------------");
        double x = 2;
        double y = 3;
        double z = x + y;
        System.out.println(z);
        double d = x / y;
        System.out.println(d);

        int num1 = 10;
        int num2 = 4;
        int result = num1 % num2;
        System.out.println("Modules : " + result);
        System.out.println("----------------Assignment operators---------------------");

        // Assignment operators
        int num3 = 7;
        int num4 = 70;
        num3 += num4;
        System.out.println(num3);
        System.out.println("----------------Unary Operators---------------------");
        // Unary Operators
        int num5 = 5;
        num5--;
        System.out.println(num5);

        int num6 = 6;
        System.out.println(-num6);
        System.out.println(num6);

        int pre = 5;
        int post = 5;
        System.out.println(++pre);
        System.out.println(post++);
        System.out.println("post : " + post + " pre : " + pre);
        System.out.println("----------------Relational operators---------------------");
        // Relational operators
        int small = 2;
        int big = 10;
        System.out.println(small > big);



    }
}
