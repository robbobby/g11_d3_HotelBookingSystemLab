import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp() {
        guest1 = new Guest("Joe Bloggs");
        guest2 = new Guest("Jane Doe");
        conferenceRoom = new ConferenceRoom("CCR", 2);
    }
    @Test public void testRoomHasName() {
        assertEquals("CCR", conferenceRoom.getName());
    }
    @Test public void testRoomHasCapacity() {
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void canCheckAGuestIn() {
        conferenceRoom.checkGuestIn(guest1);
        assertEquals(1, conferenceRoom.currentCapacity());
    }
}
