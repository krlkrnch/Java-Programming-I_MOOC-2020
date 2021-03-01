
public class MainProgram {

    public static void main(String[] args) {
        Product product = new Product("Tomat", "köögviljade riiul", 2);
        System.out.println(product);
        Product product1 = new Product("Kurk");
        System.out.println(product1);

        Product product2 = new Product("Kartulikrõpsud", "neljas vahekäik.");
        System.out.println(product2);

        Product product3 = new Product("Piim", 90);
        System.out.println(product3);

    }
}
