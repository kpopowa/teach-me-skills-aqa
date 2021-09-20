package com.popova.lesson4.task1;

public class Main {
    public static void main(String[] args) {
        String month = "january";

        switch (Month.valueOf(month.toUpperCase())){
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
