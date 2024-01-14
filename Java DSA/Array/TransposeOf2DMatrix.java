package Array;
public class TransposeOf2DMatrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result1 = transpose(matrix1);
        printMatrix(result1);
        // Output: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] result2 = transpose(matrix2);
        printMatrix(result2);
        // Output: [[1, 4], [2, 5], [3, 6]]
    }
}
