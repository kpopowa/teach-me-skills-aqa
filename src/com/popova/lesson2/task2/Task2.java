package com.popova.lesson2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April" )|| month.equalsIgnoreCase("May")) {
            System.out.println("Spring");
        }else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")){
            System.out.println("Summer");
        }else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("Autumn");
        }else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")){
        System.out.println("Winer");
        }else
            System.out.println("Mistake");
    }
}