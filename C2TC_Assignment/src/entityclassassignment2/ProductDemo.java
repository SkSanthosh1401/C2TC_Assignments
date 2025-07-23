package entityclassassignment2;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 55000.0);
        Product p2 = new Product(2, "Smartphone", 20000.0);
        Product p3 = new Product(3, "Tablet", 15000.0);
        Product p4 = new Product(4, "Smartwatch", 5000.0);

        System.out.println("Product Details:");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}