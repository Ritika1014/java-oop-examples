public class OnlineShopping_ProductDetails_UsingThisKeyword {
    String productName;
    double price;
    int quantity;

    void setProductDetails(String productName, double price, int quantity) {
        this.productName = productName; // Using 'this' to refer to instance variable
        this.price = price;             // Using 'this' to refer to instance variable
        this.quantity = quantity;       // Using 'this' to refer to instance variable
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        OnlineShopping_ProductDetails_UsingThisKeyword product = new OnlineShopping_ProductDetails_UsingThisKeyword();
        product.setProductDetails("Laptop", 70000, 1);
        product.displayProductDetails();
    }
    
}
