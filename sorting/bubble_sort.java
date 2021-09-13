package com.sarvesh;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {12,7,10,8,5};
        BubbleSort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] nums){
        boolean isSwapped ;
        for(int i = 0; i< nums.length ;i++){
             isSwapped = false;
            for(int j =1 ; j< nums.length -i; j++){
                if (nums[j -1] > nums[j]){
                       int temp = nums[j];
                       nums[j] = nums[j-1];
                       nums[j-1] = temp;
                       isSwapped = true;
                }
            }

            if (isSwapped == false){
                break;
            }
        }
    }
}
