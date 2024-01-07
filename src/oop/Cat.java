package oop;

public class Cat extends Animal{

    public static String type = "Cat";

    public Cat(String sound) {
        super(sound);
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating......");
    }
}
