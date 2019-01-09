import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestsInRoom;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestsInRoom = new ArrayList<>();
        this.type = type;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return new ArrayList<>(this.guestsInRoom);
    }

    public String getType() {
        return type;
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
