package com.recursion;

public class CountPermutation {
    public static void main(String[] args) {
        System.out.println(Countpermutation("","abc"));
    }
    static int Countpermutation(String ans,String input){
        if(input.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = input.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            count = count + Countpermutation(f + ch + s, input.substring(1));
        }
        return count;
    }
}
