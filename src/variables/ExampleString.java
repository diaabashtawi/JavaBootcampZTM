package variables;

public class ExampleString {

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hello";
        boolean same = s1.equals(s2);
        System.out.println(same);

        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        s2 = s2.toUpperCase();
        System.out.println(s2);

        String subString = s2.substring(1,3);
        System.out.println(subString);

        boolean startWith = s2.startsWith("h");
        System.out.println(startWith);

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s2.charAt(3));


    }
}
