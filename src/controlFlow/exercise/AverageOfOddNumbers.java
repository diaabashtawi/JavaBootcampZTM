package controlFlow.exercise;

public class AverageOfOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, 5, 8};
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number % 2 != 0){
                sum+=number;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Average of the od numbers is :" + average);

    }
}
