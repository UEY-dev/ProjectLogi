public class Shipment {
    int shipmentId;
    String origin;
    String destination;
    String status;
    double totalWeight;
    public Shipment(int shipmentId, String origin, String destination,
                    String status, double totalWeight) {
        this.shipmentId = shipmentId;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
        this.totalWeight = totalWeight;
    }
}
