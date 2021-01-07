import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void checkGuestIn(Guest guest) {
        if(getCapacity() > currentCapacity()) {
            this.guests.add(guest);
        }
    }

    public int currentCapacity() {
        return this.guests.size();
    }
}
