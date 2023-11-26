package controlFlow;

import java.util.Scanner;

public class ExampleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter Your Name : " );
            input = scanner.nextLine();
        }while (input.length() < 2);

    }
}
