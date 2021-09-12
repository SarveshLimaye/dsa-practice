package com.binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9 ,17};
        int target = 4;
        int ans = bs(arr,target);
        System.out.println(ans);

    }

    static  int bs(int[] arr, int target){
      int start =0 ;
      int end = arr.length -1;
      while(start <= end ){
          int mid = start + (end - start)/2;
          if (arr[mid]==target){
              return mid;
          }else if (arr[mid] > target){
              end = mid -1;
          }else{
              start = mid + 1;
          }
      }
      return -1;
    }
}
