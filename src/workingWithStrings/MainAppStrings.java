package workingWithStrings;

public class MainAppStrings {
    public static void main(String[] args) {
        String str = "Deya Bakheet";
        int length = str.length();
        System.out.println(length);
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("eet"));
        System.out.println(str.substring(2, 5));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String strDemo = "      bla bla bla    ";
        System.out.println(strDemo);
        System.out.println(strDemo.trim());

    }
}
