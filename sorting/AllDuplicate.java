//leetcode q - https://leetcode.com/problems/find-all-duplicates-in-an-array/

package com.sarvesh;
import java.util.List;
import java.util.ArrayList;
public class AllDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j<arr.length;j++ ){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
