package concurrentprogrmming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private static int counter = 0;

    private static final Lock lock = new ReentrantLock();
    static synchronized void incrementCounter() {
        if (lock.tryLock()){
            try {
                int current = counter;
                System.out.println("Before : " + counter + ", Current thread : " + Thread.currentThread().getId());
                counter = current + 1;
                System.out.println("After : " + counter);
            }finally {
                lock.unlock();
            }
        }else {
            System.out.println("Other task");
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(Count::incrementCounter).start();
        }
    }
}
