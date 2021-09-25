package com.popova.lesson1;

public class Main {

    public static void main(String[] args) {
        int a = 5674;
        int b = 1000;
        int c =100;
        int d = 10;

        int e = a / b;
        int f = a % b;

        int g = f / c;
        int g1 = f % c;

        int h = g1 / d;
        int h1 = g1 % d;



        System.out.println(e + "тысяч");
        System.out.println(g + "сотен" );
        System.out.println("десятков");
        System.out.println("единиц");


    }
}
