package com.popova.lesson2;

import java.util.Scanner;

public class Task3Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit){
            String ex = sc.nextLine();
            isExit = ex.equalsIgnoreCase("exit");
        }
        System.out.println("exit");
    }
}
