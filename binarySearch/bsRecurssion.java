package com.binarySearch;

public class bsRecurssion {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,12};
        int target = 9;
        int ans = bs(arr,0,arr.length-1,target);
        System.out.println(ans);
    }
    static int bs(int[] arr,int start,int end,int target){

        if(start > end){
            return -1;
        }

        int m = start + (end - start)/2;

        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return bs(arr, start, m-1, target);
        }

        return bs(arr,m+1,end,target);

    }
}
