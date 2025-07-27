public class Demo25 {
    public static void main(String[] args) {
        int a[] = { 4, 3, 6, 2, 1, 1 };
        int n = 6;
        findMissingAndRepeated(a, n);
    }
    /* public static void findMissingAndRepeated(int a[],int n)
    {
        int missing = -1, repeated = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                repeated = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        if (missing != -1 && repeated != -1) {
            System.out.println(missing + " " + repeated);
        }
    } */
    // ? Time Complexity : O(n^2)
    
    public static void findMissingAndRepeated(int a[],int n)
    {
        int hash[] = new int[n + 1];
        int missing = -1, repeated = -1;

        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                missing = i;
            } else if (hash[i] == 2) {
                repeated = i;
            }
            if (missing != -1 && repeated != -1) {
                break;
            }
        }
        System.out.println(missing + " " + repeated);
    }
}