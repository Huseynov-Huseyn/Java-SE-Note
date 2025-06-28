package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

import java.util.Arrays;

public class Order {
    private final ProductCatalog productCatalog;
    private Product[] orderedProducts=new Product[0];
    private int count = 0;

    public Order(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void addOrder(int id, int amount) {

        try {
            Product productById = productCatalog.findProductById(id);
            if (productById == null) {
                throw new ProductNotFoundException("Product with " + id + " id is not found");
            }
            if (amount > productById.getStockQuantity()) {
                throw new InsufficientStockException("Doesn't have enough stock!");
            }
            double totalAmount = amount * productById.getPrice();
            PaymentProcessor.processPayment(totalAmount);
            productCatalog.reduceStock(id, amount);

            if (orderedProducts.length <= count) {
                orderedProducts = Arrays.copyOf(orderedProducts, orderedProducts.length + 3);
            }
            orderedProducts[count] = productById;
            count++;

        } catch (ProductNotFoundException e) {
            System.err.println("Product problem : " + e.getMessage());
        } catch (InsufficientStockException e) {
            System.err.println("Stock problem : " + e.getMessage());
        } catch (PaymentProcessingException e) {
            System.err.println("Payment process : " + e.getMessage());
        }
    }

}
