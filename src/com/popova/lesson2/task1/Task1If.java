package com.popova.lesson2.task1;

import java.util.Scanner;

public class Task1If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        String vowel = "Это гласная буква";
        String consonant = "Это согласная буква";
        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E")|| letter.equalsIgnoreCase("U") || letter.equalsIgnoreCase("Y") || letter.equalsIgnoreCase("O") ||letter.equalsIgnoreCase("I")) {
            System.out.println(vowel);
        } else
            System.out.println(consonant);


    }
}
