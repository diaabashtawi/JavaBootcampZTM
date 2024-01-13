package genericsandcollections.exercises;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

    private List<T> content;

    public Bag(List<T> content) {
        this.content = new ArrayList<>();
    }

    public Bag() {
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public void addItem(T item){
        content.add(item);
    }

    public void reomveItem(T item){
        content.remove(item);
    }
}
