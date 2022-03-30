package com.bl.birdsanctuarysystem;

public class Peacock extends Bird implements Flyable{

    public Peacock(String id) {
        id = "p001";
        name = "Peacock";
        color = Color.BLUE;
    }
    @Override
    public void fly() {
        System.out.println("Peacock Can Fly");

    }
}
