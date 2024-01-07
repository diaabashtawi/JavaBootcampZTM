package constructor.mainapp;

import constructor.Person;

public class CustomConstructorExample {
    public static void main(String[] args) {
        Person person = new Person(
                "Deya Bakheet",
                31
        );
        System.out.println("Person Object Created.");
    }
}
