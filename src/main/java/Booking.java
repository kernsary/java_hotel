public class Booking {

    private Bedroom room;
    private int nights;

    public Booking(){
    }

    public void bookRoom(Bedroom bedroom1, int nights) {
        room = bedroom1;
        this.nights = nights;
    }

    public Bedroom getRoom() {
        return room;
    }

    public int getNumberOfNights() {
        return nights;
    }

    public int getBill() {
        return room.getRate() * nights;
    }
}
