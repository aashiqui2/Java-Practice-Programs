public class Demo33 {

    public static void printSubarraysWithSumK(int[] arr, int q) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == q) {
                    System.out.print("Subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    //? Time Complexity: O(n^3)
    

    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, -2, 3 };
        int k = 3;

        System.out.println("Subarrays with sum " + k + " are:");
        printSubarraysWithSumK(arr, k);
    }

}
