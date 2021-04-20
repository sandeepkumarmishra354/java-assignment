public class MyRunnable1 implements Runnable {
    public void run() {
        for(int i=1; i<=10; i++)
            System.out.println("From Runnable 1: "+i);
    }
}
