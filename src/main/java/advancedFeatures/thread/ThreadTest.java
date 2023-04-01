package advancedFeatures.thread;

public class ThreadTest {
    public static void main(String[] args) {
        //threads is the execution thread(the operation being carried out) in a program.
        Thread thread1 = new Thread(() -> {
            System.out.println("Sleeping for 6 seconds");
            try {
                Thread.sleep(6000);
                System.out.println("Done sleeping 6 sec");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Sleeping for 3 sec");
            try {
                Thread.sleep(3000);
                System.out.println("Done sleeping 3 sec");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
