package src_homework.Lesson_5;

public class DiagonalMatrix {
    public static void main(String[] args) {

        char[][] matrix = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        System.out.println("-----------------");

        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        System.out.print("Diagonal #1 : ");
//        0/0,1/1,2/2
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        System.out.println("-----------------");

//      0/2,1/1,2/0
        System.out.print("Diagonal #2 : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][2 - i] + " ");
        }
        System.out.println();
        System.out.println("-----------------");

    }
}