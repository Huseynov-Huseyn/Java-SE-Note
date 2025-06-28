package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

public class ECommerceApp {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Nescafe", 12.1, 12);
        Product p2 = new Product(2, "Lays", 3.1, 242);
        Product p3 = new Product(3, "Doritos", 2.1, 213);
        ProductCatalog pc = new ProductCatalog();
        pc.addProduct(p1);
        pc.addProduct(p2);
        pc.addProduct(p3);
        pc.addProduct(p2);
        pc.ShowProduct();
        Order o = new Order(pc);
        o.addOrder(2, 2);
        o.addOrder(1, 2);
        System.out.println(pc.findProductById(2));
    }


}
