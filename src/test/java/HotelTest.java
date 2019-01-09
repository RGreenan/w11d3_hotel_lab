import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private OtherRoom diningroom;
    private OtherRoom reception;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<OtherRoom> otherRooms;

    @Before
    public void before(){
        this.guest = new Guest("Jennifer");
        this.bedroom1 = new Bedroom(1, 1, "single");
        this.bedroom2 = new Bedroom(2, 2, "double");
        this.diningroom = new OtherRoom("diningroom", 20);
        this.reception = new OtherRoom("reception", 5);
        this.bedrooms = new ArrayList<>();
        this.bedrooms.add(bedroom1);
        this.bedrooms.add(bedroom2);
        this.otherRooms = new ArrayList<>();
        this.otherRooms.add(diningroom);
        this.otherRooms.add(reception);
        this.hotel = new Hotel("Fawlty Towers", bedrooms, otherRooms);
    }

    @Test
    public void hasName(){
        assertEquals("Fawlty Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.getBedrooms().size());
    }

    @Test
    public void hasOtherRooms(){
        assertEquals(2, hotel.getOtherRooms().size());
    }

    @Test
    public void canCheckInGuests__Bedrooms(){
        hotel.checkIn(guest, bedroom1);
        assertEquals(1, hotel.guestsInRoom(bedroom1).size());
    }

    @Test
    public void canCheckInGuests__OtherRooms(){
        hotel.checkIn(guest, diningroom);
        assertEquals(1, hotel.guestsInRoom(diningroom).size());
    }

    @Test
    public void canCheckOutGuests__Bedrooms(){
        hotel.checkIn(guest, bedroom1);
        assertEquals(1, hotel.guestsInRoom(bedroom1).size());
        hotel.checkOut(guest, bedroom1);
        assertEquals(0, hotel.guestsInRoom(bedroom1).size());
    }

    @Test
    public void canCheckOutGuests__OtherRooms(){
        hotel.checkIn(guest, reception);
        assertEquals(1, hotel.guestsInRoom(reception).size());
        hotel.checkOut(guest, reception);
        assertEquals(0, hotel.guestsInRoom(reception).size());
    }
}
