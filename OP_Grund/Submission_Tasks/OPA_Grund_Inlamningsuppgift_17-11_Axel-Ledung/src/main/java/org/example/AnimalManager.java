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
                    FeedAnimal(crop);
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

    }
    private void AddAnimal() {

    }
    private void RemoveAnimal() {

    }
    private void FeedAnimal(ArrayList<Crop> crop) {

    }
    public ArrayList<Animal> GetAnimals() {
        return animalArrayList;
    }

}
