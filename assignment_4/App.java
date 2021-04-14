public class App {
    public static void main(String args[]) {
        try {
            BookARide ride = new BookARide();
            ride.bookSeat(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
