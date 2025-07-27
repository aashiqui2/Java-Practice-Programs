import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo26 {
    public static void main(String[] args) {
       /*  int a[] = { 1, 2, 5, 4, 0 };
        int b[] = { 2, 4, 5, 0, 1 };

        Arrays.sort(a);
        Arrays.sort(b);
        boolean isequal = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isequal = false;
                break;
            }
        }
        if (isequal) {
            System.out.println("true");
        } else {
            System.out.println("false");

        } */
        // ? Time Complexity: O(nlogn)

        Map<Integer, Integer> counterMap = new HashMap<>();
        int n = 5;
        int a[] = { 1, 2, 5, 4, 0 };
        int b[] = { 2, 4, 5, 0, 1 };
        boolean isequal = true;

        for (int i = 0; i < n; i++) {
            int counter = counterMap.getOrDefault(a[i], 0);
            counterMap.put(a[i], counter + 1);
        }
        for (int i = 0; i < n; i++) {
            int counter = counterMap.getOrDefault(b[i], 0);
            if (counter == 0) {
                isequal = false;
            }
            counterMap.put(b[i], counter - 1);
        }
        if (isequal) {
            System.out.println("equal");
        }
    }
}
