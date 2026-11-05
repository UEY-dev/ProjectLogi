import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Shipment> shipments = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Warehouse> warehouses = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
        System.out.println("Shipment added.");
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added.");
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
        System.out.println("Warehouse added.");
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added.");
    }

    public void listele() {
        System.out.println("\nLISTING RECORDS");
        System.out.println("Shipments count: " + shipments.size());
        System.out.println("Products count: " + products.size());
        System.out.println("Warehouses count: " + warehouses.size());
        System.out.println("Vehicles count: " + vehicles.size());
    }
}