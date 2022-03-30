package com.bl.birdsanctuarysystem;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    static private UserInterface instance;

    private UserInterface() {

    }

    static synchronized UserInterface getInstance() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    int showMainMenu() {
        System.out.println("Select any one from below options \n\n1. Add the birds" +
                "\n2. Remove the birds\n" + "3. Edit the bird list\n4. Printing the birds\n"
                + Main.MAINEXIT + ". Exit");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        return option;
    }

    int showUpdateMenu() {
        System.out.println("Select any one from below options \n\n1. Update the Id" +
                "\n2. Update the Name \n" + "3. Edit the Color \n4. Exit");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        return option;
    }


    public void print(Set birdList) {
        for (Object list : birdList) {
            System.out.println(list);
        }
    }

    public void printFlyAble(Set<Bird> birdSet) {
        for (Bird bird : birdSet) {
            if (bird instanceof Flyable) {
                Flyable flyableBird = (Flyable) bird;
                flyableBird.fly();
            }
        }
    }

    public void printSwimAble(Set<Bird> birdSet) {
        for (Bird bird : birdSet) {
            if (bird instanceof Swimmable) {
                Swimmable swimmableBird = (Swimmable) bird;
                swimmableBird.swim();
            }
        }
    }


}