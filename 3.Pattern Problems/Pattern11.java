public class Pattern11 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // i-1 spaces in each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // i-1 spaces in each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
