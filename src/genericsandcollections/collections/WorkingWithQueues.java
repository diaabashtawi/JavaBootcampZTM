package genericsandcollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque<>();
        strings.add("Deya");
        strings.add("Bakheet");
        strings.add("Java");
        strings.add("Python");
        strings.addFirst("Node js");
        System.out.println(strings);
        strings.pop();
        System.out.println("Peek : " + strings.peek());
        System.out.println("Size : " + strings.size());
        strings.pollLast();
        System.out.println(strings);
        for (String str : strings){
            System.out.println(str);
        }

    }
}
