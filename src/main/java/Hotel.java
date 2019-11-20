import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom1) {
        bedrooms.add(bedroom1);
    }

    public void addConferenceRoom(ConferenceRoom confRoom1) {
        conferenceRooms.add(confRoom1);
    }

    public void bedroomCheckin(Bedroom bedroom1, Guest guest1) {
        if(!bedroom1.isFull()){
            bedroom1.addGuest(guest1);
        }
    }

    public void confRoomCheckIn(ConferenceRoom confRoom1, Guest guest1) {
        if(!confRoom1.isFull()){
            confRoom1.addGuest(guest1);
        }
    }
}
