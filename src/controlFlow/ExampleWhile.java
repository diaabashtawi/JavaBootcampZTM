package controlFlow;

public class ExampleWhile {
    public static void main(String[] args) {
        int i =0;
        boolean notFound = true;
        while (notFound){
            int randomNumber = (int) (Math.random() * 11);
            System.out.println("Value : " + randomNumber);
            if (randomNumber == 10){
                notFound =false;
            }
        }
        System.out.println("----------------------------");
        while (i < 100){
            System.out.println((int)(Math.pow(i, 2)));
            i++;
        }

    }
}
