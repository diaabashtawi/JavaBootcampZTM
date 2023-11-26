package object;

import object.exercise.Car;
import object.exercise.Person;


public class MainApp {

    public static void main(String[] args) {
        Person p1 = new Person(
                31,
                "Deya Bakheet"
        );
        System.out.println(p1);
        System.out.println("-----------------------------------------");
        Car c1 = new Car(
                "BMW",
                p1
        );
        System.out.println(c1);
        System.out.println("-----------------------------------------");
        int number = 1024;
        System.out.println(number);
        System.out.println(modifyNumber(number));
        System.out.println("-----------------------------------------");
        modifyPerson(p1);
        System.out.println(p1);

    }

    public static int modifyNumber(int num){
        num = num * 2;
        return num;
    }

    public static void modifyPerson(Person p){
        p.setAge(32);
        p.setName("Diaa Bashtawi");
    }
}
