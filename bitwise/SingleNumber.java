package com.sarvesh;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    static public int singleNumber(int[] nums) {
        int result = 0;
        for(int i =0 ; i< nums.length;i++ ){
            result^=nums[i];
        }

        return result;
    }
}
