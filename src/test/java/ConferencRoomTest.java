import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferencRoomTest {

    private ConferenceRoom confRoom1;
    private Guest guest1;

    @Before
    public void before() {
        confRoom1 = new ConferenceRoom("Excelsior", 1);
        guest1 = new Guest("Zsolt");
    }

    @Test
    public void hasName() {
        assertEquals("Excelsior", confRoom1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, confRoom1.getCapacity());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, confRoom1.getNumberOfGuests());
    }

    @Test
    public void canAddGuest() {
        confRoom1.addGuest(guest1);
        assertEquals(1, confRoom1.getNumberOfGuests());
    }

    @Test
    public void knowsIfFull() {
        confRoom1.addGuest(guest1);
        assertEquals(true, confRoom1.isFull());
    }

    @Test
    public void knowsIfNotFull() {
        assertEquals(false, confRoom1.isFull());
    }
}
