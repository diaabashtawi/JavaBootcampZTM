package concurrentprogrmming;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Main Thread : " + Thread.currentThread().getId());
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Runnable runnable = () -> System.out.println("Hello from Lambda Runnable!");
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
