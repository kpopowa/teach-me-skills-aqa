package com.popova.lesson3;

public class Train {
    public static void main(String[] args) {
        int[] nums = { 2,5,6,1,9,19,40};
        int max = nums[0];
        int min = nums[1];
        for(int i = 1; i<nums.length;i++){
            if (nums [i] > max){
                max = nums[i];


            }

        }
        for (int i  = 1; i < nums.length; i ++){
            if(nums [i]< min){
                min = nums[i];

            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println( max + min);
    }
}
