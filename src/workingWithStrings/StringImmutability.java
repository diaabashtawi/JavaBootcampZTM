package workingWithStrings;

public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Deya";
        String s2 = s1;
        System.out.println(s1 + " " + s2);

        s1 = "Hello World";

        System.out.println(s1 + " " + s2);

        // Mutable objects
        Text t1 = new Text();
        t1.setDescription("Hi");
        Text t2 = t1;
        System.out.println(t1.getDescription() + " " + t2.getDescription());
        t2.setDescription("Hello");
        System.out.println(t1.getDescription() + " " + t2.getDescription());
    }
}
