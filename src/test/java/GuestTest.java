import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void setUp() {
        guest1 = new Guest("Joe Bloggs");
    }

    @Test
    public void guestHasAName() {
        assertEquals("Joe Bloggs", guest1.getName());
    }

}


