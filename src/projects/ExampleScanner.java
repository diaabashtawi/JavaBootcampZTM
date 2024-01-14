package projects;

import java.util.Scanner;

public class ExampleScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        scanner.close();
    }
}
