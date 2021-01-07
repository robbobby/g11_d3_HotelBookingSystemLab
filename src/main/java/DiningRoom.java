import java.util.ArrayList;

public class DiningRoom {
    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public void addToGuests(Guest guest) {
            this.guests.add(guest);
    }
}
