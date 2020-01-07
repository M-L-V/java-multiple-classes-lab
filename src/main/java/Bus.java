import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {

        if (passengers.size() < this.capacity) {
          passengers.add(person);
         }
    }

    public Person removePassenger() {

        return this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {
            Person commuter = busStop.removePersonFromQueue();
            passengers.add(commuter);
    }
}
