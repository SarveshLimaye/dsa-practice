package com.recursion;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] nums = {7,3,5,9,1};
         mergesort(nums,0, nums.length);
        System.out.println(Arrays.toString(nums));


    }
    static void mergesort(int[] arr,int s,int e){
        if(e-s ==1){
            return ;
        }
        int mid = s + (e -s )/2;
         mergesort(arr,0,mid);
         mergesort(arr,mid,e);

        merge(arr,s,mid,e);
    }

    private static int[] merge(int[] arr,int s,int m, int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=m;
        int k =0;
        while(i < m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] =arr[i];
            i++;
            k++;
        }
        while (j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l =0 ; l < mix.length ;l++){
        arr[s+l] = mix[l];
        }
        return mix;
    }
}
