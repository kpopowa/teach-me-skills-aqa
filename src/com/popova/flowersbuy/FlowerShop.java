package com.popova.flowersbuy;

public class FlowerShop {

    public static enum Flower{
        CHRISANTEMUM, ROSE, CLOVE, DAISY
    }

    public static enum Color{
        RED, WHITE, PINK, BLUE, YELLOW
    }

    private int flowerQuantity;
    private String type;
    private Flower flower;
    private Color color;

    public FlowerShop (int flowerQuantity, String type, Flower flower, Color color){
        this.flowerQuantity = flowerQuantity;
        this.type = type;
        this.flower = flower;
        this.color = color;
    }





}
