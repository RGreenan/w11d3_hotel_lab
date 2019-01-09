import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 1, "single", 35);
        guest = new Guest("Melinda");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("single", bedroom.getType());
    }

    @Test
    public void hasGuestCount(){
        assertEquals(0, bedroom.getGuestsInRoom().size());
    }

    @Test
    public void canAddGuest(){
        String result = bedroom.addGuest(guest);
        assertEquals("Guest added!", result);
    }

    @Test
    public void canRemoveGuest(){
        String result = bedroom.addGuest(guest);
        assertEquals("Guest added!", result);
        String guestRemoved = bedroom.removeGuest(guest);
        assertEquals("Guest removed!", guestRemoved);
    }
}
