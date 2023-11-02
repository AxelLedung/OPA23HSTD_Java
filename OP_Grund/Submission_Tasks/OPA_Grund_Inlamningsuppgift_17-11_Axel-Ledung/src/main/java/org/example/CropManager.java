package org.example;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CropManager {
    ArrayList<Crop> cropList = new ArrayList<Crop>();
    public void CropMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-------------------------------------------------");
        System.out.println("                CROPS MANAGER");
        System.out.println("-----------------------------------------------");
        System.out.println("1. View Crops");
        System.out.println("2. Add Crops");
        System.out.println("3. Remove Crops");
        System.out.println("5. Back");
        int input;
        try {
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Function not added yet...................");
                    break;
                case 2:
                    System.out.println("Function not added yet...................");
                    break;
                case 3:
                    System.out.println("Function not added yet...................");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Incorrect Input.");
                    break;
            }
            CropMenu();
        }
        catch (Exception e) {
            System.out.println("Error Input.");
            CropMenu();
        }
    }
    private void ViewCrops() {

    }
    private void AddCrop(Crop crop, int quantity) {

    }
    private void RemoveCrop(Crop crop, int quantity) {

    }
    public ArrayList<Crop> GetCrops() {
        return cropList;
    }
}
