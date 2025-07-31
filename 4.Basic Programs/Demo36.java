public class Demo36 {

   
    public static int[][] add(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;

        if (m != B.length || n != B[0].length) {
            throw new IllegalArgumentException("Both matrices must have the same dimensions.");
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        int[][] sum = add(A, B);

        System.out.println("Matrix A + B:");
        printMatrix(sum);
    }
}

