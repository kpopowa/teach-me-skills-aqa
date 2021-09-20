package com.popova.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int[] numb = { 5,1,12,10};
        int max = numb[0];
        int min = numb [0];
        for ( int i = 0; i< numb.length; i++){
            if (max < numb[i]){
                max = numb [i];
            }
            if (min > numb [i]){
                min = numb[i];

            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
