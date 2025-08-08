import java.util.HashMap;
import java.util.Map;

public class Demo41 {
    //! Brute force Approach
    /* public static int subarraysWithXorK(int[] a, int k) {
        int n = a.length; 
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // step 2:calculate XOR of all elements:
                int xorr = 0;
                for (int K = i; K <= j; K++) {
                    xorr = xorr ^ a[K];
                }

                // step 3:check XOR and count:
                if (xorr == k)
                    cnt++;
            }
        }
        return cnt;
    } */
    //? Time Complexity:  O(N^3)

    //! Better Approach
    /* public static int subarraysWithXorK(int []a, int k) {
        int n = a.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int xorr = 0;
            for (int j = i; j < n; j++) {

                xorr = xorr ^ a[j];
                if (xorr == k) cnt++;
            }
        }
        return cnt;
    } */
    //? Time Complexity: O(n^2)

    //! Optimal Approach
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; 
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    } 
    //? Time Complexity: Time Complexity: O(N) or O(N*logN) 

     public static void printSubArray(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 2, 2, 6, 4 };
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        printSubArray(a);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
