import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class HotelTest {
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Hotel hotel;


    @Before public void setUp() {
        guest1 = new Guest("Joe Bloggs");
        guest2 = new Guest("Jane Doe");
        conferenceRoom = new ConferenceRoom("CCR", 2);
        bedroom = new Bedroom(1, 2, "Double");
        hotel = new Hotel();
    }
    @Test public void hasEmptyBedroomList() {
        assertEquals(0, hotel.getBedroomCount());
    }
    @Test public void hasEmptyConferenceRoomList() {
        assertEquals(0, hotel.getConferenceRoomCount());
    }
}
