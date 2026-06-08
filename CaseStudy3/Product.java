package CaseStudy3;

public class Product {

    private String productId;
    private String productName;
    private String category;
    private double price;
    private int stockQuantity;
    public Product(String productId, String productName, String category, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price should be greater than 0.");
            this.price = 1;
        }
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Stock Quantity cannot be negative.");
            this.stockQuantity = 0;
        }
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price should be greater than 0.");
        }
    }
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Stock Quantity cannot be negative.");
        }
    }
    public void displayProductDetails() {
        System.out.println("Product Details");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
    public static void main(String[] args) {
        Product p1 = new Product("P1001","Wireless Mouse","Electronics",899,50);
        p1.displayProductDetails();
    }
}
