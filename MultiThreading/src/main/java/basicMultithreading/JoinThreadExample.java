package basicMultithreading;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 : " + i);
            }
            System.out.println("Thread 1 done executing!");
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 : " + i);
            }
            System.out.println("Thread 2 done executing!");
        });

        System.out.println("Before invoking threads...");
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("Done executing the threads!");
    }
}
