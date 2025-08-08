public class Demo43 {
        public static void main(String[] args) {
        int a[] = { -1, 2, -3, 3 };
        System.out.println(findLargestPositiveWithNegative(a));
    }

    public static int findLargestPositiveWithNegative(int[] a) {
        int largest = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == -a[j]) {
                    largest = Math.max(largest, Math.abs(a[i]));
                }
            }
        }

        return largest;
    }
}
