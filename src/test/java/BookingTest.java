import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 1, "single", 35);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNights(){
        assertEquals(3, booking.getNights());
    }

    @Test
    public void hasBill(){
        assertEquals(105, booking.getBill());
    }
}
