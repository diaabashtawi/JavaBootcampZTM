package accessmodifiers.exercise;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name : " + student.name);
        System.out.println("Age : " + student.age);
        System.out.println("Address : " + student.address);
        // Cannot access the private field 'ssn' from another class
        //System.out.println("SSN : " + student.ssn);

        System.out.println("-------------------------------------------------");
        Counter.increment();
        System.out.println("Count : " + Counter.count);
    }
}
