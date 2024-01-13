package genericsandcollections.exercises;

public class ExercisesMainApp {

    public static void main(String[] args) {
        Book<Integer> integerBook = new Book<>();
        integerBook.setContent(42);
        System.out.println(integerBook.getContent());
        System.out.println("*************************************");
        Book<String> stringBook = new Book<>();
        stringBook.setContent("Java Programming");
        System.out.println(stringBook.getContent());

        System.out.println("----------------------------------------------------");

        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Apple");
        stringBag.addItem("Banana");
        stringBag.reomveItem("Apple");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(1);
        integerBag.addItem(12);
        integerBag.reomveItem(1);


    }
}
