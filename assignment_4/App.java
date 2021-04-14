public class App {
    public static void main(String args[]) {
        try {
            BookARide ride = new BookARide();
            //this will throw exception if argument's value exceeds 4
            ride.bookSeat(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
