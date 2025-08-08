import java.util.HashMap;

public class Demo40 {
    //! Brute Force Approach
    /* public static int solve(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; ++i) {
            int sum = 0;
            for (int j = i; j < a.length; ++j) {
                sum += a[j];
                if (sum == 0) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    } */
    //? Time Complexity: O(N^2)

    public static int solve(int A[])
    {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0;
        int n=A.length; 

        for(int i = 0;i<n;i++) {
            sum += A[i]; 
            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {
                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }
    //? Time Complexity: O(N)

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

    public static void main(String args[]) {
        int a[] = { 9, -3, 3, -1, 6, -5 };
        printSubArray(a);
        System.out.println(solve(a));
    }
}
