import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherRoomTest {
    OtherRoom otherRoom;
    Guest guest;

    @Before
    public void before(){
        otherRoom = new OtherRoom("dining room", 20);
        guest = new Guest("Frank");
    }

    @Test
    public void hasCapacity(){
        assertEquals(20, otherRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("dining room", otherRoom.getName());
    }

    @Test
    public void hasGuestCount(){
        assertEquals(0, otherRoom.getGuestsInRoom().size());
    }

    @Test
    public void canAddGuest(){
        String result = otherRoom.addGuest(guest);
        assertEquals("Guest added!", result);
    }

    @Test
    public void canRemoveGuest(){
        String result = otherRoom.addGuest(guest);
        assertEquals("Guest added!", result);
        String guestRemoved = otherRoom.removeGuest(guest);
        assertEquals("Guest removed!", guestRemoved);
    }
}
