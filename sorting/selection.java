package com.sarvesh;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {8,4,12,6,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] nums){
        for (int i = 0 ; i < nums.length;i++){
            int last = nums.length - i -1;
            int max= getMax(nums,0,last);
            swap(nums,max,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMax(int[] arr, int start, int end){
        int maxElement = start;
        for (int i = start; i<= end; i++){
           if(arr[i] > arr[maxElement]){
               maxElement = i;
           }
        }

        return maxElement;
    }
}
