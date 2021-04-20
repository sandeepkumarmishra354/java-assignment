public class App {
    public static void main(String args[]) {
        // this will print from 1 to 10
        Thread thread1 = new Thread(new MyRunnable1());
        // this will print from 10 to 1
        Thread thread2 = new Thread(new MyRunnable2());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}