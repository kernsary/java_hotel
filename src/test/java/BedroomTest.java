import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1, 1, "Single", 10);
        guest1 = new Guest("Zsolt");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.getNumberOfGuests());

    }

    @Test
    public void knowsIfFull() {
        assertEquals(false, bedroom1.isFull());
    }

    @Test
    public void knowsIfNotFull() {
        bedroom1.addGuest(guest1);
        assertEquals(true, bedroom1.isFull());

    }

    @Test
    public void hasNightlyRate() {
        assertEquals(10, bedroom1.getRate());
    }

    @Test
    public void knowsIfEmpty() {
        assertEquals(true, bedroom1.isEmpty());
    }

    @Test
    public void knowsIfNotEmpty() {
        bedroom1.addGuest(guest1);
        assertEquals(false, bedroom1.isEmpty());
    }
}
