package src_homework.Lesson_7.Polymorphism.FightSimulation;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon();
        sword.attack();
        sword.attack("Secret life");
        sword.attack(120);
        sword.attack(1.2);
        System.out.println("=======");
        Weapon bow = new Weapon();
        bow.attack();
        bow.attack("hidden life");
        bow.attack(220);
        bow.attack(2.2);
    }
}
