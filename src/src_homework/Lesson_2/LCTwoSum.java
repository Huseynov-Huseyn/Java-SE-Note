package src_homework.Lesson_2;

public class LCTwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 5, 5, 11}, 10);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target && i != k) {
                    return new int[]{i, k};
                }
            }
        }
        return null;
    }
}
