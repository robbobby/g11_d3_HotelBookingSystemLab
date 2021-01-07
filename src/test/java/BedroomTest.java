import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp() {
        guest1 = new Guest("Joe Bloggs");
        guest2 = new Guest("Jane Doe");

        bedroom = new Bedroom(1, 2, "Double");
    }

    @Test
    public void bedroomHasACapacity() {
        assertEquals(2, bedroom.hasACapacity());
    }

    @Test
    public void canCheckAGuestIn() {
        bedroom.checkGuestIn(guest1);
        assertEquals(1, bedroom.currentCapacity());
    }


}
