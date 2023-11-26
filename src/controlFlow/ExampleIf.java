package controlFlow;

public class ExampleIf {
    public static void main(String[] args) {
        int intput = 1;
        if (intput != 0){
            System.out.println("2 divided by the input equals : " + (2 / intput));
        }else {
            System.out.println("Input cannot be 0");
        }

        int hour = 6;
        if (hour >= 0 && hour < 12){
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Good Evening!");
        }else {
            System.out.println("I don't know that hour, but Good Day!");
        }
    }
}
