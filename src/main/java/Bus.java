import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Bus() {
        passengers = new ArrayList<Passenger>();
        this.capacity = 2;
    }

    public int getNumPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (getNumPassengers() < this.capacity) {
            passengers.add(passenger);
        }
    }
    
    public void removePassenger(Passenger passenger) {

        if (getNumPassengers() > 0) {
            passengers.remove(0);
        }
    }
}
