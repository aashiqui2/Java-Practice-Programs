public class Pattern10 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
