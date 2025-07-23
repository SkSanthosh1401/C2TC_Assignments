package entityclassassignment2;

public class Product {
    public int productId;
    public String productName;
    public double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void display() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: ₹" + price);
    }
}