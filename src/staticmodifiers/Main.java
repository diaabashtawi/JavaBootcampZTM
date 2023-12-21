package staticmodifiers;

public class Main {

    public static void main(String[] args) {
        System.out.println(MathUitls.pi);
        double result = MathUitls.subtract(10, 3);
        System.out.println(result);


        System.out.println(MathUitls.pi);
        System.out.println(MathUitls.subtract(12, 3));

        MathUitls.pi = 15;
        System.out.println(MathUitls.pi + " " + MathUitls.pi + " " + MathUitls.pi);
    }
}
