//! Write a program to delete a element from the array and return the resized array?
public class Demo24 {
    public static void main(String[] args) {
        int[] array = { 5,1,2,4,3};
        int elementToDelete = 2;

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        array = deleteElement(array, elementToDelete);

        System.out.println("Array after deleting element " + elementToDelete + ":");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] deleteElement(int[] arr, int element) {
        int[] newArray = new int[arr.length - 1];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return arr;
        }
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }
}
