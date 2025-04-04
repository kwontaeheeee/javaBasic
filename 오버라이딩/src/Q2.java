public class Q2 {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics();
        products[1] = new Clothing();
        products[2] = new Food();

        for(Product product: products){
            product.showInfo();
        }
    }
}
