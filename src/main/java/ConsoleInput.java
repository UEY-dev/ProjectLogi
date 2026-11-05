import java.util.Scanner;

public class ConsoleInput {
    private Scanner input;

    public ConsoleInput(Scanner input) {
        this.input = input;
    }

    public Shipment createShipment() {
        System.out.print("Shipment ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Origin: ");
        String origin = input.nextLine();

        System.out.print("Destination: ");
        String destination = input.nextLine();

        System.out.print("Status: ");
        String status = input.nextLine();

        System.out.print("Total Weight: ");
        double weight = input.nextDouble();
        input.nextLine();

        return new Shipment(id, origin, destination, status, weight);
    }

    public Product createProduct() {
        System.out.print("Product ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.print("Weight: ");
        double weight = input.nextDouble();
        input.nextLine();

        return new Product(id, name, price, quantity, weight);
    }

    public Warehouse createWarehouse() {
        System.out.print("Warehouse ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Warehouse Name: ");
        String name = input.nextLine();

        System.out.print("Location: ");
        String location = input.nextLine();

        System.out.print("Capacity: ");
        int capacity = input.nextInt();
        input.nextLine();

        return new Warehouse(id, name, location, capacity);
    }

    public Vehicle createVehicle() {
        System.out.print("Vehicle ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Vehicle Type: ");
        String type = input.nextLine();

        System.out.print("Capacity: ");
        double capacity = input.nextDouble();
        input.nextLine();

        System.out.print("Current Location: ");
        String location = input.nextLine();

        System.out.print("Available (true/false): ");
        boolean available = input.nextBoolean();
        input.nextLine();

        return new Vehicle(id, type, capacity, location, available);
    }
}