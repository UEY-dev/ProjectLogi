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
        System.out.print("Product Name: ");
        String name = input.nextLine();
        return new Product(); 
    }

    public Warehouse createWarehouse() {
        System.out.print("Warehouse Location: ");
        String location = input.nextLine();
        return new Warehouse();
    }

    public Vehicle createVehicle() {
        System.out.print("Vehicle Plate: ");
        String plate = input.nextLine();
        return new Vehicle();
    }
}