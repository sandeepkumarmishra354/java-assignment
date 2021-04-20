public class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 10; i >= 1; i--)
            System.out.println("From Runnable 2: " + i);
    }
}
