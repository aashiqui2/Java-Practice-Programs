public class Demo3 {
    //!Brute Force Approach 
    static boolean isSorted(int arr[], int n) {
            /* for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
                        
        return true; */
        //! Time Complexity: O(N^2)
        //! Optimal Approach
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
        //! Time Complexity: O(N)
    }

    //! Optimal Approach
    public static  boolean check(int[] nums,int n) {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[(i+1)%n])
            {
                count++;
            }
        }
        if(count<=1)
        {
            return true;
        }  
        return false;
    }
    public static void main(String args[]) {
        //int arr[] = { 1, 2, 3, 4, 5 }, n = 5;
        int arr[] = { 3,4,5,2,1,1}, n = 6;
        System.out.println(check(arr, n));
    }
}

