package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

import java.util.Arrays;

public class ProductCatalog {
    private Product[] products = new Product[3];
    private int count = 0;

    public void addProduct(Product p) {
        if (products.length <= count) {
            products = Arrays.copyOf(products, products.length + 3);
        }
        products[count] = p;
        count++;
    }

    public Product findProductById(int id) {
        for (Product p : products) {
            if (p != null && p.getId() == id) {
                return p;
            }
        }
        throw new ProductNotFoundException("Product with id " + id + " not found.");
    }

    public void ShowProduct() {
        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public void reduceStock(int id, int amount) {
        for (Product product : products) {
            if (product != null && product.getId() == id) {
                product.setStockQuantity(product.getStockQuantity() - amount);
            }
        }
    }
}
