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
        System.out.println("4. View Arrays");
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
                case 4:
                    System.out.println("Animals:");
                    for (int i = 0; i < animalManager.animalArrayList.size(); i++) {
                        System.out.println(animalManager.animalArrayList.get(i).GetDescription());
                    }
                    System.out.println("Crops:");
                    for (int i = 0; i < cropManager.cropArrayList.size(); i++) {
                        System.out.println(cropManager.cropArrayList.get(i).GetDescription());
                    }
                    System.out.println("Animals Array:");
                    System.out.println(animalManager.animalArrayList);
                    System.out.println("Crops Array:");
                    System.out.println(cropManager.cropArrayList);
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
            System.out.println("CropArray[ " + cropManager.cropArrayList + "]");
            for (int i = 0; i < cropManager.cropArrayList.size(); i++) {
                bufferedWriter.write(cropManager.cropArrayList.get(i).GetCSV());
                if (i < cropManager.cropArrayList.size() - 1) {
                    bufferedWriter.newLine();
                    System.out.println(cropManager.cropArrayList.get(i).name);
                }
                else {
                    System.out.println(cropManager.cropArrayList.get(i).name + "fail");
                }
            }
            bufferedWriter.close();
            fileWriter = new FileWriter(animalSaveFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("AnimalArray[ " + animalManager.animalArrayList + "]");
            System.out.println(animalManager.animalArrayList.size());
            for (int i = 0; i < animalManager.animalArrayList.size(); i++) {
                bufferedWriter.write(animalManager.animalArrayList.get(i).GetCSV());
                System.out.println(i + " " + animalManager.animalArrayList.size());
                if (i < animalManager.animalArrayList.size() - 1) {
                    System.out.println(i + " " + animalManager.animalArrayList.size());
                    System.out.println(animalManager.animalArrayList.get(i).name);
                    bufferedWriter.newLine();
                }
                else {
                    System.out.println(animalManager.animalArrayList.size());
                    System.out.println("fail" + animalManager.animalArrayList.get(i).name);
                }
            }
            bufferedWriter.close();
            LoadCSV();
            return true;
        }
        catch (Exception e) {
            System.out.println("WTF IS HAPPENING");
            LoadCSV();
            return false;
        }
    }
    private boolean LoadCSV() {
        try {
            FileReader fileReader = new FileReader(cropSaveFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            /*System.out.println("Array Length in LoadCSV(): " + cropManager.cropArrayList.size());
            int amountOfObjects = cropManager.cropArrayList.size();
            for (int i = 0; i < amountOfObjects; i++) {
                System.out.println(cropManager.cropArrayList.get(i).name + " deleted.");
                cropManager.cropArrayList.remove(i);
            }
            System.out.println("Array Length in LoadCSV(): " + cropManager.cropArrayList.size());
            */
            cropManager.cropArrayList.clear();
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
            animalManager.animalArrayList.clear();
            /*amountOfObjects = animalManager.animalArrayList.size();
            for (int i = 0; i < animalManager.animalArrayList.size(); i++) {
                animalManager.animalArrayList.remove(i);
            }*/
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
