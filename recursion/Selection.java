import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 3, 1 };
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selectionSort(arr, r - 1, 0, 0);
        }
    }
}