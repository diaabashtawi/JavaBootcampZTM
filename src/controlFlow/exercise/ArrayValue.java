package controlFlow.exercise;

public class ArrayValue {
    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5
        };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element number " + i + " is : " + numbers[i]);
        }
    }
}