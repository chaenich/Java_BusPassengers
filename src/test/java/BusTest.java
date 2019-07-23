import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Passenger passenger;

    @Before
    public void setup() {
        bus = new Bus();
        passenger = new Passenger();
    }

    @Test
    public void canGetNumPassengers() {
        assertEquals(0, bus.getNumPassengers());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(passenger);
        assertEquals(1,bus.getNumPassengers());
    }

    @Test
    public void cannotAddPassengers() {
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(2, bus.getNumPassengers());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(passenger);
        assertEquals(1,bus.getNumPassengers());
        bus.removePassenger(passenger);
        assertEquals(0,bus.getNumPassengers());

    }


}
