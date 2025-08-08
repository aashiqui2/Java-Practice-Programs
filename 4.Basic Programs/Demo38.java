public class Demo38 {
      public static void main(String[] args) {
        int a[] = { 3, 1, 2, 4 };
        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && a[i] % 2 == 0) {
                i++;
            }

            while (i < j && a[j] % 2 != 0) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        // Print the sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
