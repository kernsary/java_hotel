import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private int rate;

    public Bedroom(int roomNumber, int capacity, String type, int rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public boolean isFull() {
        return getNumberOfGuests() >= capacity;
    }

    public void addGuest(Guest guest1) {
        guests.add(guest1);
    }

    public void removeGuest(Guest guest1) {
        guests.remove(guest1);
    }

    public int getRate() {
        return rate;
    }
}
