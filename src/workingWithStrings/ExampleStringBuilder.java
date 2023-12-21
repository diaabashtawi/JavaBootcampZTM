package workingWithStrings;

public class ExampleStringBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder1 = new StringBuilder("Deya Aldden Bakheet");
        stringBuilder1.append(" Software Developer");
        String str = stringBuilder1.toString();

        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        stringBuilder2.append(", ");
        stringBuilder2.append("World");
        stringBuilder2.append("!");
        String greeting = stringBuilder2.toString();

        System.out.println(str);
        System.out.println(stringBuilder2);

    }
}
