package Knou.Ch04;

public class Product {
    // ProductCode pc = new ProductCode();

    class ProductCode {
        int a = 10;
        int b = 20;
    }

    public static void main(String[] args) {
        Product p = new Product();
        Product.ProductCode pc = p.new ProductCode();
        
        // System.out.println(p.pc.a);
        System.out.println(pc.a);
    }
}
