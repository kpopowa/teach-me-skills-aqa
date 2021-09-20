package com.popova.flowers;

public class Cup {
    Flower[]  flowers;

    public void printAllFlowers() {
        for (Flower flower:flowers) {
            System.out.println(flower.color);
        }
    }

    public void printOnlyRed() {
        for (Flower flower:flowers) {
            if (flower.equals("red")) {
                System.out.println(flower.color);
            }
        }
    }
}
