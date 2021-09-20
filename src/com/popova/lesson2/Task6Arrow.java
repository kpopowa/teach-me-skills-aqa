package com.popova.lesson2;

import java.util.Scanner;

public class Task6Arrow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i = start;
        int sum = 0;
        while (i >= start && i <= end) {
            if (i % 3 ==0) {
                i++;
                continue;

            }

            sum = sum + i;
            i++;


        }
        System.out.println(sum);
    }
}
