public class Product6 {
    
    String name;
    double price;
    Product6(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double discountPercentage) {
        price = price - (price * discountPercentage / 100);
    }

    public static void main(String[] args) {
        Product6 product = new Product6("Laptop", 60000);

        System.out.println("Original Price: " + product.price);

        product.applyDiscount(10); // 10% discount
        System.out.println("Price after discount: " + product.price);
    }
}
