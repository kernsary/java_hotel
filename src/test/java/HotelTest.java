import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel1;
    private Bedroom bedroom1;
    private ConferenceRoom confRoom1;
    private Guest guest1;

    @Before
    public void before() {
        hotel1 = new Hotel();
        bedroom1 = new Bedroom(1, 1, "Single", 10);
        confRoom1 = new ConferenceRoom("Excelsior", 1);
        guest1 = new Guest("Zsolt");
    }

    @Test
    public void startsWithNoBedrooms() {
        assertEquals(0, hotel1.getNumberOfBedrooms());
    }

    @Test
    public void startsWithNoConferenceRooms() {
        assertEquals(0, hotel1.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddBedroom() {
        hotel1.addBedroom(bedroom1);
        assertEquals(1, hotel1.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel1.addConferenceRoom(confRoom1);
        assertEquals(1, hotel1.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel1.addBedroom(bedroom1);
        hotel1.bedroomCheckin(bedroom1, guest1);
        assertEquals(1, bedroom1.getNumberOfGuests());

    }

    @Test
    public void cannotCheckGuestIntoOccupiedBedroom(){
        bedroom1.addGuest(guest1);
        hotel1.addBedroom(bedroom1);
        hotel1.bedroomCheckin(bedroom1, guest1);
        assertEquals(1, bedroom1.getNumberOfGuests());

    }

    @Test
    public void canCheckGuestOutOfBedroom() {
        hotel1.addBedroom(bedroom1);
        hotel1.bedroomCheckin(bedroom1, guest1);
        hotel1.bedroomCheckout(bedroom1, guest1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom() {
        hotel1.addConferenceRoom(confRoom1);
        hotel1.confRoomCheckIn(confRoom1, guest1);
        assertEquals(1, confRoom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom() {
        hotel1.addConferenceRoom(confRoom1);
        hotel1.confRoomCheckIn(confRoom1, guest1);
        hotel1.confRoomCheckOut(confRoom1, guest1);
        assertEquals(0, confRoom1.getNumberOfGuests());
    }

    @Test
    public void canReturnEmptyBedrooms() {
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<Bedroom>();
        emptyBedrooms.add(bedroom1);
        hotel1.addBedroom(bedroom1);
        assertEquals(emptyBedrooms, hotel1.getEmptyBedrooms());
    }


}
