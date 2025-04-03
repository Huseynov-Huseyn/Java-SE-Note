package src_summary.Lesson_5;

public class MultiDimentionalArrays {

    public static void main(String[] args) {

        int[][] multiArr = new int[3][3];

        String[][] xo = {
                {"o", "x", "o"},
                {"o", "x", "o"},
                {"x", "o", "x"}
        };

        for (String[] arr : xo) {
//            System.out.println(Arrays.toString(arr));
            for (String i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        System.out.println("==========");
        String[][] xor = new String[5][5];
        xor[2][3] = "A";
        for (String[] arr : xor) {
//            System.out.println(Arrays.toString(arr));
            for (String i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}
