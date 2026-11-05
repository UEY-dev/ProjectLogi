public class Product {
    int productId;
    String name;
    double price;
    int quantity;
    double weight;

    public Product(int productId, String name, double price,
                    int quantity, double weight) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }
}
