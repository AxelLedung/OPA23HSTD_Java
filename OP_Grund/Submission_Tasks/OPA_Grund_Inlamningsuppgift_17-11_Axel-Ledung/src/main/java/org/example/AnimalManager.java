package org.example;

import javax.swing.text.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
    ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
    public void AnimalMenu(ArrayList<Crop> crop) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("                ANIMAL MANAGER:");
        System.out.println("-----------------------------------------------");
        System.out.println("1. View Animals");
        System.out.println("2. Add Animals");
        System.out.println("3. Remove Animals");
        System.out.println("4. Feed Animals");
        System.out.println("5. Back");
        int input;
        try {
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    ViewAnimals();
                    break;
                case 2:
                    AddAnimal();
                    break;
                case 3:
                    RemoveAnimal();
                    break;
                case 4:
                    FeedAnimals(crop);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Incorrect Input.");
                    break;
            }
            AnimalMenu(crop);
        }
        catch (Exception e) {
            System.out.println("Incorrect Input.");
            AnimalMenu(crop);
        }
    }
    private void ViewAnimals() {
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("                 YOUR ANIMALS");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < animalArrayList.size(); i++) {
            System.out.println(animalArrayList.get(i).GetDescription());
        }
        System.out.println("");
        System.out.println("PRESS ENTER TO CONTINUE...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    private void AddAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("             INSERT ANIMAL NAME");
        System.out.println("-----------------------------------------------");
        String animalName = scanner.nextLine();
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("              INSERT ANIMAL SPECIES");
        System.out.println("-----------------------------------------------");
        String animalSpecies = scanner.nextLine();
        animalArrayList.add(new Animal(animalName, animalSpecies));
    }
    private void RemoveAnimal() {
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("               DELETE ANIMAL BY ID");
        System.out.println("-----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try {
            int idInput = Integer.parseInt(scanner.nextLine());
            int idDelete = -1;
            for (int i = 0; i < animalArrayList.size(); i++) {
                if (animalArrayList.get(i).getId() == idInput) {
                    idDelete = i;
                    break;
                }
            }
            if (animalArrayList.get(idDelete) != null) {
                System.out.println("-----------------------------------------------");
                System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
                System.out.println("-----------------------------------------------");
                System.out.println("        ARE YOU SURE YOU WANT TO DELETE:");
                System.out.println("       Name: " + animalArrayList.get(idDelete).name + ", Species: " + animalArrayList.get(idDelete).getSpecies());
                System.out.println("-----------------------------------------------");
                System.out.println("1. YES DESTROY IT!");
                System.out.println("2. No");
                int deleteChoice = Integer.parseInt(scanner.nextLine());
                switch (deleteChoice) {
                    case 1:
                        System.out.println("-----------------------------------------------");
                        System.out.println("         Name: " + animalArrayList.get(idDelete).name + ", Species: " + animalArrayList.get(idDelete).getSpecies());
                        System.out.println("         WAS DELETED FROM RAF-MS™");
                        System.out.println("-----------------------------------------------");
                        animalArrayList.remove(idDelete);
                        System.out.println("");
                        System.out.println("PRESS ENTER TO CONTINUE...");
                        scanner.nextLine();
                        return;
                    case 2:
                        return;
                    default:
                }
            }
            else {
                System.out.println("-----------------------------------------------");
                System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
                System.out.println("-----------------------------------------------");
                System.out.println("       ANIMAL WITH THAT ID DOES NOT EXIST");
                System.out.println("-----------------------------------------------");
                System.out.println("");
                System.out.println("PRESS ENTER TO CONTINUE...");
                scanner.nextLine();
                return;
            }
        }
        catch (Exception e) {
            System.out.println("-----------------------------------------------");
            System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
            System.out.println("-----------------------------------------------");
            System.out.println("       ANIMAL WITH THAT ID DOES NOT EXIST");
            System.out.println("-----------------------------------------------");
            System.out.println("");
            System.out.println("PRESS ENTER TO CONTINUE...");
            scanner.nextLine();
            return;
        }
    }
    private void FeedAnimals(ArrayList<Crop> crop) {

    }
    public ArrayList<Animal> GetAnimals() {
        return animalArrayList;
    }

}
