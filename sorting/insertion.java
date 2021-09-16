package com.sarvesh;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {8,2,6,5,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] nums){
        for (int i = 0 ; i < nums.length - 1 ; i++){
            for (int j = i + 1 ; j > 0; j--){
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
