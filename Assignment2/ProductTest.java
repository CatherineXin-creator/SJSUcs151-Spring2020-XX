package Assignment2;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("iphone X", "The best choice for your kid", 899.99, 16);
        System.out.println(product.getProductName());
        System.out.println(product.getProductDescription());
        System.out.println(product.getProductPrice());
        System.out.println(product.getMaximumOrder());

        //change the value of the product name
        //product.setProductName("iphone Xs");


    }
}
