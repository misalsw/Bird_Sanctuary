package com.bl.birdsanctuarysystem;

public class Penguin extends Bird implements Swimmable{

    public Penguin(String id) {
        this.id = id;
        name = "Penguin";
        color = Color.BLACK_WHITE;
    }
    @Override
    public void swim() {
        System.out.println("Penguin Can Swim");
    }
}