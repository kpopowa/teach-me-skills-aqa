package com.popova.lesson2;

public class Task6Arrow2 {
    public static void main(String[] args) {
        int [] number = {3,4,9,6,0};
        int temp;
        boolean sorted = false;
        while(!sorted){
            sorted = true;

            for (int i = 0; i<number.length -1; i++){
                if (number[i]<number[i+1]){
                    temp = number[i];
                    number[i]= number[i+1];
                    number[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for(int i: number){
            System.out.println(i);
        }
    }
}
