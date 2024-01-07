package oop;

public class MainAppOOP {

    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        Cat cat = new Cat();
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        dog.eat();
//        dog1.bark();
//        dog1.eat("meat");
//        System.out.println(Dog.type);
//        System.out.println("***********************************");
//        cat.eat();
//        System.out.println(Cat.type);

        Animal animal = new Animal("Roar");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        animal.makeSound();
        bird.makeSound();
        parrot.makeSound();
    }
}
