package src_homework.Lesson_7.Abstraction.GroceryShopping;

public class Main {
    public static void main(String[] args) {
        Dairy d = new Dairy(2, "Milk", 2);
        FreshProduce fd = new FreshProduce(4, "Apple", 0.5);
        Meat m = new Meat(5, "Chicken", 7);

        GroceryShopping gc = new GroceryShopping();
        System.out.println("===========================");
        System.out.println(gc.addProduct(d));
        System.out.println("===========================");
        System.out.println(gc.addProduct(fd));
        System.out.println("===========================");
        System.out.println(gc.addProduct(m));
        System.out.println("===========================");
        gc.printReceipt();
        System.out.println("===========================");
        System.out.println(gc.calculateTotalCost());

    }
}
