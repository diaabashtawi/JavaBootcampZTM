package controlFlow;

public class ExampleBreakAndContinue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int serachValue = 7;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == serachValue) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        System.out.println("-------------------------------------------");

        for (int number : numbers) {
            if ((number % 2) == 0) {
                continue;
            }
            System.out.println(number);
        }

    }
}
