package org.example;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Farm {
    CropManager cropManager = new CropManager();
    AnimalManager animalManager = new AnimalManager();
    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("                   MAIN MENU");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Manage Animals");
        System.out.println("2. Manage Crops");
        System.out.println("3. Load");
        System.out.println("4. Save");
        System.out.println("5. Exit");
        int input;
        try {
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    animalManager.AnimalMenu(cropManager.GetCrops());
                    break;
                case 2:
                    cropManager.CropMenu();
                    break;
                case 3:
                    System.out.println("Function not added yet...................");
                    System.out.println("Returning to Main Menu...................");
                    break;
                case 4:
                    System.out.println("Function not added yet...................");
                    System.out.println("Returning to Main Menu...................");
                    break;
                case 5:
                    System.out.println("Exiting RAF-MS™ - Robust Amazing Farm - Management System");
                    System.out.println("Exiting..................................................");
                    System.exit(0);
                default:
                    System.out.println("Incorrect Input.");
                    break;
            }
            MainMenu();
        }
        catch (Exception e) {
            System.out.println("Incorrect Input.");
            MainMenu();
        }
    }
    private boolean Save() {
        return false;
    }
    public Farm() {
        System.out.println("");
    }
}
