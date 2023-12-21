package accessmodifiers;

public class MainApp {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Deya Bakheet";
        p.sayHi();
        /*'secrcet' has private access in 'accessmodifiers.Person'
        p.secrcet = "Deya Bakheet";*/
        /*'tellSecret()' has private access in 'accessmodifiers.Person'
        p.tellSecret();*/
    }
}
