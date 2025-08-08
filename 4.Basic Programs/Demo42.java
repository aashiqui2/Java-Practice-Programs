public class Demo42 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1 };
        int k = 1;
        int index = removeElement(a, k);
        for (int i = 0; i < index; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
