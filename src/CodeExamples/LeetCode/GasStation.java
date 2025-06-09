package CodeExamples.LeetCode;

public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        System.out.println("You need to start  : " + canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            totalTank += gain;
            currentTank += gain;

            if (currentTank < 0) {
                startingStation = i + 1;
                currentTank = 0;
            }
        }

        return totalTank >= 0 ? startingStation : -1;
    }

}
