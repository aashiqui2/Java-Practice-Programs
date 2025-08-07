public class Demo37 {
    public static void main(String[] args) {

       int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
       int rows=3,cols=3;

        /* int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        } */

        int n = matrix.length; 

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }   
    }
}



    
