package src_homework.Lesson_7.Abstraction.GroceryShopping;

public abstract class Product {
    protected String name;
    protected double unitPrice;
    protected double amount;

    public Product(double amount, String name, double unitPrice) {
        this.amount = amount;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    double getCost() {
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
