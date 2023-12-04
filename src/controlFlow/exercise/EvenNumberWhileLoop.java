package controlFlow.exercise;

public class EvenNumberWhileLoop {
    public static void main(String[] args) {

        int num = 5;
        int counter = 0;
        int i = 0;

        while (counter < num ){
            if (i % 2 == 0){
                System.out.println(i);
                counter++;
            }
            i++;
        }
    }
}
