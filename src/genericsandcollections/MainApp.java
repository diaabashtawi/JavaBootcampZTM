package genericsandcollections;

import genericsandcollections.generic.Bag;
import genericsandcollections.generic.Chihuahua;
import genericsandcollections.generic.Laptop;

public class MainApp {
    public static void main(String[] args) {
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        Chihuahua chihuahua = new Chihuahua();
        chihuahua.setName("Rocky");
        chihuahuaBag.setContent(chihuahua);

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("Dell XPS 14");
        laptopBag.setContent(laptop);
    }
}
