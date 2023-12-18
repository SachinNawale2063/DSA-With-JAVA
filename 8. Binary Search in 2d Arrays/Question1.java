import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[][] arr= {
            {10,20,30,40},
            {11,21,31,41},
            {13,23,33,43},
            {19,29,39,49}
        };

        int target = 33;

        int [] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }

            else if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            }
        }

        return new int[] {-1,-1};
    }
}
