import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp() {
        guest1 = new Guest("Joe Bloggs");
        guest2 = new Guest("Jane Doe");
        diningRoom= new DiningRoom("Cool Dining");
    }
    @Test
    public void testRoomHasName() {
        assertEquals("Cool Dining", diningRoom.getName());
    }


}
