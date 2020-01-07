import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Station", 20);
    }

    @Test
    public void busHasDestination(){
        assertEquals("Station", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(20, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
}

