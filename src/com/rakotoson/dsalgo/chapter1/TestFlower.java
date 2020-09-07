package com.rakotoson.dsalgo.chapter1;

import com.rakotoson.dsalgo.chapter1.models.Flower;

public class TestFlower {
    public static void main(String[] args) {
        Flower flower = new Flower();

        flower.setName("Jasmine");
        flower.setPetals(5);
        flower.setPrice(25f);

        System.out.println("Name: " + flower.getName());
        System.out.println("Petals: " + flower.getPetals());
        System.out.println("Price: " + flower.getPrice());
    }
}
