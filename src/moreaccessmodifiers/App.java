package moreaccessmodifiers;

import accessmodifiers.Person;

public class App extends Person{

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Deya Bakheet";
        person.sayHi();
    }

    public void greeting(){
        sayHi();
        name = "Linda";
    }
}
