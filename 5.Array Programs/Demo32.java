import java.util.HashMap;
import java.util.Map;

public class Demo32 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        System.out.println(subarraySum(a, k));

    }

    // ! Brute Force Approach
    /* public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    } */
    // ? Time complexity: O(N^3)

    // ! Better Approach
    /* public static int subarraySum(int[] arr, int k) {

        int n = arr.length; 
        int cnt = 0; 

        for (int i = 0; i < n; i++) { 
            int sum = 0;
            for (int j = i; j < n; j++) { 
                sum += arr[j];
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    } */
    //? Time complexity: O(n^2)

    //! Optimal Approach
    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        Map <Integer,Integer> mpp= new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); 
        for (int i = 0; i < n; i++) {  
            preSum += arr[i];
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
    //? Time Complexity: O(n)
}
