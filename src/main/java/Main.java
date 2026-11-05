import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Scanner scanner = new Scanner(System.in);
        ConsoleInput consoleInput = new ConsoleInput(scanner);

        while (true) {
            System.out.println("\nWELCOME, PLEASE PICK ONE:");
            System.out.println("1. Add Shipment");
            System.out.println("2. Add Product");
            System.out.println("3. Add Warehouse");
            System.out.println("4. Add Vehicle");
            System.out.println("5. List");
            System.out.println("6. Exit");
            System.out.print("Please pick: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Scanner buffer temizliği

            switch (choice) {
                case 1:
                    Shipment shipment = consoleInput.createShipment();
                    db.addShipment(shipment);
                    break;

                case 2:
                    Product product = consoleInput.createProduct();
                    db.addProduct(product);
                    break;

                case 3:
                    Warehouse warehouse = consoleInput.createWarehouse();
                    db.addWarehouse(warehouse);
                    break;

                case 4:
                    Vehicle vehicle = consoleInput.createVehicle();
                    db.addVehicle(vehicle);
                    break;

                case 5:
                    db.listele();
                    break;

                case 6:
                    System.out.println("Closing application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}