import java.util.ArrayList;

public class linear {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 7, 7, 9, 11 };

        System.out.println(multipleIndex(nums, 7, 0, new ArrayList<>()));
    }

    static ArrayList<Integer> multipleIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return multipleIndex(arr, target, index + 1, list);
    }

}
