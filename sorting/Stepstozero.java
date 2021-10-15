package com.sarvesh;
//leetcode q - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Stepstozero {
    public static void main(String[] args) {
        int ans = numberOfSteps(14);
        System.out.println(ans);

    }
    static int numberOfSteps(int num) {
        return print(num);
    }

    static int zero(int num,int count){
        if(num == 0){
            return count;
        }
        int rem = num %2;
        if(rem == 0){
            return zero(num/2,count+1);
        }else{

            return zero((num-1),count +1);
        }


    }

    static int print(int num){
        return zero(num,0);
    }
}
