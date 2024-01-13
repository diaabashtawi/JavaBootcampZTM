package genericsandcollections.exercises;

public class Book <T>{

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
