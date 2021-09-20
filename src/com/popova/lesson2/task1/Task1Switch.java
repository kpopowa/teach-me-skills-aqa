package com.popova.lesson2.task1;


import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Task1Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        switch (letter.toUpperCase()) {
            case "A":
                System.out.println("Это гласная буква");
                break;
            case "U":
                System.out.println("Это гласная буква");
                break;
            case "O":
                System.out.println("Это гласная буква");
                break;
            case "I":
                System.out.println("Это гласная буква");
                break;
            case "Y":
                System.out.println("Это гласная буква");
                break;
            case "E":
                System.out.println("Это гласная буква");
                break;
            default:
                System.out.println("Это согласная буква");

        }
    }
}
