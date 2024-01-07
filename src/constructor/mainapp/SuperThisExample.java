package constructor.mainapp;

import constructor.Dog;

public class SuperThisExample {

    public static void main(String[] args) {

        Dog d1 = new Dog("Labrador", "Dog", 5);
        Dog d2 = new Dog();
        System.out.println("Dog objects created.");
    }
}
