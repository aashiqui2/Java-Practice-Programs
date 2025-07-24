//! Write a program to check whether the given array is subset of the original array?
import java.util.*;

public class Demo28 {
    public static void main(String[] args) {
        // Example arrays; you can change them to test other cases
        int[] A = {5, 8, 12, 7, 7, 3, 8, 10};
        int[] B = {7, 8, 3};

        if (isSubset(A, B)) {
            System.out.println("Yes");
        } else {
            System.out.println("Not");
        }
    }

    //! Approach 1
    public static boolean isSubset(int[] A, int[] B) {
        boolean[] used = new boolean[A.length];
        for (int i = 0; i < B.length; i++) {
            boolean found = false;
            for (int j = 0; j < A.length; j++) {
                if (!used[j] && B[i] == A[j]) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    //! Approach 2
    /* public static boolean isSubset(int[] A, int[] B) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : A) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : B) {
            if (freq.getOrDefault(num, 0) == 0) {
                return false; 
            }
            freq.put(num, freq.get(num) - 1);
        }
        return true;
    } */
}

