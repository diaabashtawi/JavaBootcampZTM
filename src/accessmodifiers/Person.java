package accessmodifiers;

public class Person {
    public String name;
//    protected String name;
    private String secrcet;
    public void sayHi(){
        System.out.println("Hello, I'm " + name);
        tellSecret();
    }

    private void tellSecret(){
        System.out.println("The secret is " + secrcet);
    }


}
