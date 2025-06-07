package src_homework.Lesson_7.Abstraction.GroceryShopping;

public class GroceryShopping {
    private Product[] shoppingList = new Product[2];
    private int count = 0;

    String addProduct(Product product) {
        if (count >= shoppingList.length) {
            Product[] newShoppingList = new Product[shoppingList.length * 2];
            System.arraycopy(shoppingList, 0, newShoppingList, 0, shoppingList.length);
            shoppingList = newShoppingList;
        }
        shoppingList[count] = product;
        count++;
        return "Product added!";
    }

    String calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < count; i++) {
            totalCost += shoppingList[i].getCost();
        }
        return "Total cost of shopping list is : " + totalCost + " manat";
    }

    void printReceipt() {
        for (int i = 0; i < count; i++) {
            System.out.println(shoppingList[i].toString());
        }
    }

}