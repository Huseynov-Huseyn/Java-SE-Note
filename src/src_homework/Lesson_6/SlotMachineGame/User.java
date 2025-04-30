package src_homework.Lesson_6.SlotMachineGame;

public class User {
    private String name;
    private int balance = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    void addBalance() {
        this.balance += 100;
    }

    void deductBalance() {
        this.balance -= 5;
    }

}
