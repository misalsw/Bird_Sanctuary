package com.bl.birdsanctuarysystem;

import java.util.Objects;

public class Bird {

    String id;
    String name;
    Color color;



    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id) && color == bird.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color);
    }

    void eat() {
        System.out.println(getClass().getSimpleName() + " eats");
    }

    enum Color {GRAY, BLUE, GREEN, WHITE, BLACK_WHITE}

}


//    void fly() {
//        System.out.println(getClass().getSimpleName() + " can Fly ");
//    }
//
//    void swim() {
//        System.out.println(getClass().getSimpleName() + " can swim");
//    }
