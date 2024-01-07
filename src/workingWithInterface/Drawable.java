package workingWithInterface;

public interface Drawable {

    void draw();

    default void erase(){
        System.out.println("Erasing the drawing.");
    }

}
