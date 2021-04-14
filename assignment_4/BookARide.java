public class BookARide {
    public void bookSeat(int totalNumOfBooking) throws RideOverBookedException {
        if(totalNumOfBooking > 4) {
            throw new RideOverBookedException("You can't book more than 4 rides at a time.");
        }
        System.out.println("Ride booked successfully...");
    }
}