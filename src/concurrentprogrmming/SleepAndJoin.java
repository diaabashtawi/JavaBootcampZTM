package concurrentprogrmming;

public class SleepAndJoin {
    public static void main(String[] args) {
        Thread t = new Thread(
                ()->{
                    try {
                        System.out.println("Thread will go to sleep for 2 second");
                        Thread.sleep(2000);
                        System.out.println("I'm awake!");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
        );
        t.start();

        Thread t1 = new Thread(
                ()->{
                    System.out.println("t1 Started");
                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("t1 Finished");
                }
        );

        t1.start();

        try {
            System.out.println("Main Thread will be waiting for t1 to be done...");
            t1.join();
            System.out.println("Main thread continues...");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
