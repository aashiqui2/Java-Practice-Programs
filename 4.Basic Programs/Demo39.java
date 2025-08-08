public class Demo39 {

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = diagonalSum(mat);
        System.out.println(sum);

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0, len = mat.length;
        int i = 0, j = 0;
        while (i < len) {
            sum += mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j = len - 1;
        while (j >= 0) {
            if (i != j) {
                sum += mat[i][j];
            }
            i++;
            j--;

        }

        return sum;
    }

}
