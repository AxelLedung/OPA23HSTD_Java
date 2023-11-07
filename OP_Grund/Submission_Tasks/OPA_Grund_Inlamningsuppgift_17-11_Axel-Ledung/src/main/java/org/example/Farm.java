package org.example;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Farm {
    CropManager cropManager = new CropManager();
    AnimalManager animalManager = new AnimalManager();
    File cropSaveFile = new File("RAF-MS-crop-save.txt");
    File animalSaveFile = new File("RAF-MS-animal-save.txt");
    public Farm() {
        LoadCSV();
    }
    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("                   MAIN MENU");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Manage Animals");
        System.out.println("2. Manage Crops");
        System.out.println("3. Save");
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
                    Save();
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
        try {
            FileWriter fileWriter = new FileWriter(cropSaveFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < cropManager.cropArrayList.size(); i++) {
                bufferedWriter.write(cropManager.cropArrayList.get(i).GetCSV());
                if (i < cropManager.cropArrayList.size() - 1) {
                    bufferedWriter.newLine();
                    System.out.println(i + "newLine");
                }
                else {
                    System.out.println(i + "fail");
                    ArrayList<Entity> entityArrayList = new ArrayList<Entity>();
                    for( int j = 0; j < entityArrayList.size(); j++) {
                        //System.out.println(entityArrayList.get(j).name);
                    }
                }
            }
            bufferedWriter.close();
            fileWriter = new FileWriter(animalSaveFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < animalManager.animalArrayList.size(); i++) {
                bufferedWriter.write(animalManager.animalArrayList.get(i).GetCSV());
                if (i < cropManager.cropArrayList.size() - 1) {
                    bufferedWriter.newLine();
                    System.out.println();
                }
            }
            bufferedWriter.close();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    private boolean LoadCSV() {
        try {
            /*Scanner scanner = new Scanner(System.in);
            String filePath = scanner.nextLine();*/
            FileReader fileReader = new FileReader(cropSaveFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] variables = line.split(",");
                int id = Integer.parseInt(variables[0]);
                String cropName = variables[1];
                String cropType = variables[2];
                int quantity = Integer.parseInt(variables[3]);
                Crop crop = new Crop(cropName, cropType, quantity);
                crop.setId(id);
                cropManager.cropArrayList.add(crop);
                line = bufferedReader.readLine();
            }
            fileReader = new FileReader(animalSaveFile);
            bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            while (line != null) {
                String[] variables = line.split(",");
                int id = Integer.parseInt(variables[0]);
                String animalName = variables[1];
                String species = variables[2];
                Animal animal = new Animal(animalName, species);
                animal.setId(id);
                animalManager.animalArrayList.add(animal);
                line = bufferedReader.readLine();
            }
            return true;
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
