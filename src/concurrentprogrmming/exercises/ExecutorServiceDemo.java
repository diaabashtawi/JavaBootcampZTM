package concurrentprogrmming.exercises;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(
                    ()->{
                        System.out.println("Executing task in : " + Thread.currentThread().getName());
                    }
            );
        }

        executorService.shutdown();
    }
}
