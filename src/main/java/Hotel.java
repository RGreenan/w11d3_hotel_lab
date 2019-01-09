import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<OtherRoom> otherRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<OtherRoom> otherRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.otherRooms = otherRooms;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return new ArrayList<>(bedrooms);
    }

    public ArrayList<OtherRoom> getOtherRooms() {
        return new ArrayList<>(otherRooms);
    }

    public String checkIn(Guest guest, Bedroom room){
        return bedrooms.get(bedrooms.indexOf(room)).addGuest(guest);
    }

    public String checkIn(Guest guest, OtherRoom room){
        return otherRooms.get(otherRooms.indexOf(room)).addGuest(guest);
    }

    public ArrayList<Guest> guestsInRoom(Bedroom room){
        return bedrooms.get(bedrooms.indexOf(room)).getGuestsInRoom();
    }

    public ArrayList<Guest> guestsInRoom(OtherRoom room){
        return otherRooms.get(otherRooms.indexOf(room)).getGuestsInRoom();
    }

    public String checkOut(Guest guest, Bedroom room){
        return bedrooms.get(bedrooms.indexOf(room)).removeGuest(guest);
    }

    public String checkOut(Guest guest, OtherRoom room){
        return otherRooms.get(otherRooms.indexOf(room)).removeGuest(guest);
    }
}
