public class Demo35 {


    public static int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;         // rows in A
        int n = A[0].length;      // cols in A = rows in B
        int p = B[0].length;      // cols in B


        if (n != B.length) {
            throw new IllegalArgumentException("Matrix A columns must equal Matrix B rows.");
        }

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
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
            {7, 8},
            {9, 10},
            {11, 12}
        };

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        int[][] product = multiply(A, B);

        System.out.println("Product Matrix A x B:");
        printMatrix(product);
    }
}
