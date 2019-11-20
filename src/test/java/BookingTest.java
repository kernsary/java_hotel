import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1, 1, "Single", 10);
        booking1 = new Booking();
    }

    @Test
    public void canMakeBooking() {
        booking1.bookRoom(bedroom1, 2);
        assertEquals(bedroom1, booking1.getRoom());
        assertEquals(2, booking1.getNumberOfNights());
    }


}
