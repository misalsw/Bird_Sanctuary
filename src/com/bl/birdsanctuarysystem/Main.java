package com.bl.birdsanctuarysystem;

import java.util.Scanner;

public class Main {
    final static int MAINEXIT = 5;
    //UserInterface userInterface = UserInterface.getInstance();
    //BirdRepository birdRepository = BirdRepository.getInstance();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Welcome to Bird Sanctuary ---");
        Main main = new Main();
        UserInterface userInterface = UserInterface.getInstance();
        int option;
        do {
            option = userInterface.showMainMenu();
            main.handleUserSelection(option);
        } while (option != MAINEXIT);

    }

    void addBird() {
        BirdRepository birdRepository = BirdRepository.getInstance();
        // To-Do bird Creation via User Input
        Bird penguin = new Penguin("pn001");
        Bird penguin2 = new Penguin("pn001");
        Bird parrot = new Parrot("pt001");
        Bird duck = new Duck("d001");
        Bird ostrich = new Ostrich("o001");
        Bird peacock = new Peacock(" pk001");


        birdRepository.add(penguin);
        birdRepository.add(penguin2);
        birdRepository.add(parrot);
        birdRepository.add(duck);
        birdRepository.add(ostrich);
        birdRepository.add(peacock);
    }

    void handleUserSelection(int option) {
        BirdRepository birdRepository = BirdRepository.getInstance();
        UserInterface userInterface = UserInterface.getInstance();
        switch (option) {
            case 1:
                this.addBird();
                System.out.println("Birds added");
                userInterface.print(birdRepository.getBirdList());
                break;

            case 2:
                System.out.println("Enter bird Id to Remove");
                String id = scanner.nextLine();
                Bird removeBird = birdRepository.getBird(id);
                birdRepository.removed(removeBird);
                System.out.println("Bird removed with id :: " + id);
                break;

            case 3:
                System.out.println("Enter the bird ID you want to Update");
                String birdId = scanner.nextLine();
                userInterface.showUpdateMenu();
                int option1 = userInterface.showUpdateMenu();
                handleUpdateUserSelection(option1, birdId);
                System.out.println("Bird ID you Want is Updated :");
                break;

            case 4:
                userInterface.print(birdRepository.getBirdList());
                break;

            case MAINEXIT:
                System.out.println("Tata Bye bye");
                break;


            default:
                System.out.println("Choose Proper Option");
        }
    }

    public void handleUpdateUserSelection(int option1, String birdId) {
        BirdRepository birdRepository = BirdRepository.getInstance();
        Bird bird = birdRepository.getBird(birdId);
        switch (option1) {
            case 1:
                System.out.println("Enter the new Id : ");
                String newId = scanner.nextLine();
                bird.id = newId;
                break;

            case 2:
                System.out.println("Enter the new Name : ");
                String newName = scanner.nextLine();
                bird.name = newName;
                break;

//                case 3:
//                System.out.println("Enter the new Color : ");
//                String newColor = scanner.nextLine();
//                bird.color = newColor;
//                break;

            case 4:
                System.out.println("Thank you for exiting update");
                break;

            default:
                System.out.println("Choose Proper Option");
        }
    }
}


//        Bird penguin = new Penguin("pn001");
//        Bird penguin2 = new Penguin("pn001");
//        Bird parrot = new Parrot("pt001");
//        Bird duck = new Duck("d001");
//        Bird ostrich = new Ostrich("o001");
//        Bird peacock = new Peacock(" pk001");
//
//       BirdRepository birdRepository = new BirdRepository();
//
//        //1-many relationship
//        birdRepository.add(penguin);
//        birdRepository.add(penguin2);
//        birdRepository.add(parrot);
//        birdRepository.add(duck);
//        birdRepository.add(ostrich);
//        birdRepository.add(peacock);
//
//        UserInterface userInterface = new UserInterface();
//        userInterface.print(birdRepository.getBirdList());
//        userInterface.printFlyAble(birdRepository.getBirdList());
//
//
//        birdRepository.removed(parrot);
//        birdRepository.removed(penguin);
//        System.out.println("After Removal");
//        userInterface.print(birdRepository.getBirdList());

