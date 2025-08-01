public class Demo37 {

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int b[][] = { { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;
        int res[][] = new int[m][p];
        if (n == b.length) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) {
                        res[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        for(int [] row: res)
        {
            for(int val:row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}