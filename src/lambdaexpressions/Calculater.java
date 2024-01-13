package lambdaexpressions;


@FunctionalInterface
public interface Calculater {

    int calculate(int a, int b);

    default void print(){
        System.out.println("Welcome");
    }
}
