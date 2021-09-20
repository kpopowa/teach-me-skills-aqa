package com.popova.lesson3;

public class Fibbonachi {
    public static void main (String []args){
        int[] fib = new int[10];
        for (int i = 0; i< fib.length; i++){
            if(i < 2){
                fib[i] = 1;
            }
            else{
                fib[i] = fib[i - 2] +fib [i-1];
            }
            System.out.println(fib[i] );
        }


    }
}
