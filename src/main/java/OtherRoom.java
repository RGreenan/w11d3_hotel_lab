import java.util.ArrayList;

public class OtherRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guestsInRoom;

    public OtherRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestsInRoom = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return new ArrayList<>(this.guestsInRoom);
    }

    private int guestCount(){
        return guestsInRoom.size();
    }

    private Boolean roomIsFull(){
        if (guestCount() < capacity){
            return false;
        } else {
            return true;
        }
    }

    public String addGuest(Guest guest){
        if (!roomIsFull()){
            guestsInRoom.add(guest);
            return "Guest added!";
        } else {
            return "Room is full!";
        }
    }

    public String removeGuest(Guest guest){
        if (guestsInRoom.contains(guest)){
            guestsInRoom.remove(guest);
            return "Guest removed!";
        } else {
            return "Guest is not in room!";
        }
    }
}
