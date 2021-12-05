package com.sarvesh;

//leetcode q - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 9;
       System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;

        while(start <=end){
            int sum = numbers[start] + numbers[end];
            if(sum ==target){
                break;
            }else if(sum > target){
                end --;
            }else{
                start++;
            }
        }

        return new int[] {start+1,end+1};
    }
}
