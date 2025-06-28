import java.util.HashMap;
import java.util.Map;

public class Demo17 {
    // ! Brute Force Approach
    // public static int subarraySum(int[] a, int k) {
    // int count = 0;
    // int n = a.length;
    // for (int i = 0; i < n; i++) {
    // int sum = 0;
    // for (int j = i; j < n; j++) {
    // sum += a[j];
    // if (sum == k) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }
    // ! Time complexity: O(n^2)

    // ! Optimal Approach (prefix sum)
    public static int subarraySum(int[] a, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);//!handles subarrays starting from index 0
        // 1.subarraysum[i,j]=prefixsum[j]-prefixsum[i-1]
        // 2.k=prefixsum[j]-prefixsum[i-1]
        // 3.prefixsum[i-1]=prefixsum[j]-k;

        for (int num : a) {
            prefixSum += num;
            if (m.containsKey(prefixSum - k)) {
                count += m.get(prefixSum - k);
            }

            m.put(prefixSum, m.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
    // ! Time Complexity:O(n)

    public static void main(String[] args) {
        int a[] = { 9, 4, 20, 3, 10, 5 };
        // int a[] = { 9, 4, 0, 20, 3, 10, 5 };
        int k = 33;
        System.out.println("The count is " + subarraySum(a, k));
    }
}
