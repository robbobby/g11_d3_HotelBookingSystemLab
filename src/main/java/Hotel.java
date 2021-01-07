import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;


    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }
    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }
}
