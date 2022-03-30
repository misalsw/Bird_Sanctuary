package com.bl.birdsanctuarysystem;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
    static private BirdRepository instance;
    private final Set<Bird> birdSet = new HashSet();

    public BirdRepository() {
    }

    static synchronized BirdRepository getInstance() {
        if (instance == null) {
            instance = new BirdRepository();
        }
        return instance;
    }

    Set getBirdList() {
        return birdSet;
    }

    void add(Bird bird) {
        birdSet.add(bird);
    }

    void removed(Bird bird) {
        birdSet.remove(bird);
    }

    void update(Bird bird) {
//        bird
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Bird id to Update: ");
//        String id = scanner.nextLine();
//        UserInterface userInterface = UserInterface.getInstance();
//        userInterface.showUpdateMenu();
    }

    Bird getBird(String id) {
        for (Bird bird : birdSet) {
            if (bird.id.equals(id)) {
                return bird;
            }
        }
        return null;
    }
}
