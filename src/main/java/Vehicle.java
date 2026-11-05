public class Vehicle {
    int vehicleId;
    String vehicleType;
    double capacity;
    String currentLocation;
    boolean available;

    public Vehicle(int vehicleId, String vehicleType, double capacity,
                    String currentLocation, boolean available) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.currentLocation = currentLocation;
        this.available = available;
    }
}
