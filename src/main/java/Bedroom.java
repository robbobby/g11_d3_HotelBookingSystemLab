import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;


    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        guests = new ArrayList<Guest>();
    }

    public int hasACapacity() {
        return this.capacity;
    }

    public void checkGuestIn(Guest guest) {
        if(hasACapacity() > currentCapacity()) {
            this.guests.add(guest);
        }

    }

    public int currentCapacity() {
        return this.guests.size();
    }
}
