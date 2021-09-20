package com.popova.lesson3;


public class Task3EvenNumber {
    public static void main(String[] args) {
        int[] numb = {2, 7, 19, 45, 8, 65};
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0) {
                sum1 = sum1 + numb[i];
            } else {
                sum2 = sum2 + numb[i];
            }

        }
        System.out.println(sum1 - sum2);
    }
}