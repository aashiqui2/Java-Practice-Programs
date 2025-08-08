public class Demo44 {
    public static void main(String[] args) {
        int a[] = { 5, -2, 3, 1, 2 };
        int b = 3;
        System.out.println(solve(a, b));

    }

    public static int solve(int[] a, int b) {
        int n = a.length;
        int i = 0, j = n - 1;
        int sum = 0;
        int b2 = b;

        while (b-- > 0) {
            sum += a[i++];
        }
        System.out.println(sum + " " + i);
        int ans = sum;
        while (b2-- > 0) {
            sum -= a[--i];
            sum += a[j--];
            System.out.println(sum);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
