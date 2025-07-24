//! Write a program to print the  largest number possible from the given number?
import java.util.Collections;
import java.util.*;

public class Demo20 {
    public static void main(String[] args) {
        int n=7860915;
        String s = String.valueOf(n);
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        /* Arrays.sort(arr, new Comparator<Character>() {
            public int compare(Character a, Character b) {
                return b - a;
            }
        }); */

        Arrays.sort(arr,Collections.reverseOrder());
        for (char ch : arr) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
