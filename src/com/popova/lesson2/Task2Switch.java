package com.popova.lesson2;

import java.util.Locale;
import java.util.Scanner;

public class Task2Switch {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String yearSeason = sc.nextLine();
        switch (yearSeason.toLowerCase()){
            case "june" :
            System.out.println("summer");
            break;
            case "july" :
                System.out.println("summer");
                break;
            case "august" :
                System.out.println("summer");
                break;
            case "september" :
                System.out.println("autumn");
                break;
            case "october" :
                System.out.println("autumn");
                break;
            case "november" :
                System.out.println("autumn");
                break;
            case "december" :
                System.out.println("winter");
                break;
            case "january" :
                System.out.println("winter");
                break;
            case "february" :
                System.out.println("winter");
                break;
            case "march" :
                System.out.println("spring");
                break;
            case "april" :
                System.out.println("spring");
                break;
            case "may" :
                System.out.println("spring");
                break;
            default:
                System.out.println("mistake");


        }

    }
}
