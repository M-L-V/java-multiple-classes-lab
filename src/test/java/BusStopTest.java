import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusStopTest {

    private BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Castle");
    }

    @Test
    public void checkBusStopHasName(){
        assertEquals("Castle", busStop.getName());
    }

    @Test
    public void checksQueueIsEmpty(){
        assertEquals(0, busStop.countQueue());
    }
}
