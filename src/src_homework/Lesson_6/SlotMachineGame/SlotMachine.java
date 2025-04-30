package src_homework.Lesson_6.SlotMachineGame;

import java.util.Random;

public class SlotMachine {
    private final String[] symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    private final Random random = new Random();

    boolean pullLever() {
        int firstSymbol = random.nextInt(0, 6);
        int secondSymbol = random.nextInt(0, 6);
        int thirdSymbol = random.nextInt(0, 6);
        System.out.println(symbols[firstSymbol] + " " + symbols[secondSymbol] + " " + symbols[thirdSymbol]);
        return (firstSymbol == secondSymbol) && (secondSymbol == thirdSymbol);
    }

}
