package com.binarySearch;

public class orderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = {99,94,69,67,3};  //decreasing order array
        int target =  94;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[]nums , int target){
        int start = 0;
        int end = nums.length - 1;
        boolean isAscending = nums[start] < nums[end]; //checks for ascending or desc order
        while (start <= end){
            int mid = start +(end - start)/2;
            if (nums[mid] == target){
                return mid;
            }else if (isAscending){
                if (target > nums[mid]){  // target element lies to right of mid
                    start = mid + 1;
                }else{
                    end = mid -1;  //target element lies to left of mid
                }
            }else{                           //for desc order arrays
                if (target > nums[mid]){

                    end = mid -1; // target element lies to left of mid
                }else{
                    start = mid + 1;  // target element lies to right of mid
                }

            }
        }

        return -1;
    }
}
