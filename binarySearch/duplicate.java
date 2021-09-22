package com.binarySearch;

//leetcode question - https://leetcode.com/problems/find-the-duplicate-number/
public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2}; //leetcode test case
        int ans = findDuplicate(arr);
        System.out.println(ans);

    }

    static int findDuplicate(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        return nums[nums.length -1];

    }

    static void swap(int[] arr,int first,int second){
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
