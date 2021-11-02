package com.recursion;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");
    }
    static void permutation(String ans,String input){
        if(input.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = input.charAt(0);
        for(int i =0; i<=ans.length();i++){
            String f = ans.substring(0,i);
            String l =ans.substring(i,ans.length());
            permutation(f+ch+l,input.substring(1));
        }
    }
}
