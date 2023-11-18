package variables;

public class ExampleOfCasting {

    public static void main(String[] args) {

        long num1 = 123;
        int num2 = (int) num1;

        double d1 = 3.2;
        float f1 = (float) d1;

        byte b1 = -23;
        char c1 = (char) b1;
        System.out.println(c1);
        int i1 = c1;
        System.out.println(i1);

        char c2 = 65535;
        char c3 = (char) (c2 + 1);
        System.out.println(c3);
        System.out.println((int)c3);

    }
}
