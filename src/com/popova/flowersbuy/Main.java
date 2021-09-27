package com.popova.flowersbuy;

public class Main {
    public static void main(String[] args) {
       // FlowerShop flowerShop = new FlowerShop();
       // System.out.println(FlowerShop);

        MakeNoise noiseMaker = new Cat();
        Cat cat = new Cat();
        System.out.println(noiseMaker.makeNoise());
    }
}
