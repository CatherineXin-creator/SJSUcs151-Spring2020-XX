package Assignment2;

public final class Product {


    private final String productName;
    private final String productDescription;
    private final double productPrice;
    private final int maximumOrder;

    public Product(String productName, String productDescription, double productPrice, int maximumOrder) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.maximumOrder = maximumOrder;
    }


    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getMaximumOrder() {
        return maximumOrder;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
