import java.io.*;
import java.util.Scanner;

public class Product {
    public String name;

    public int price;

    public int quantity;

    public String Get_CSV() {
        return "hej";
    }
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public void InputIntoCSVFile(String name, int price, int quantity) {
        File assetFolder = new File("assets");
        assetFolder.mkdir();
        try {
            if (!assetFolder.exists()) {
                assetFolder.createNewFile();
                CreateCSVFile();
            } else {
                System.out.println("Folder already exist.");
                CreateCSVFile();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void CreateCSVFile() {
        File csvFile = new File("assets/csv_file.txt");
        try {
            if (!csvFile.exists()) {
                FileWriter fileWriter = new FileWriter(csvFile);
                fileWriter.close();
                System.out.println("File created at " + csvFile.getAbsolutePath());
            }
            else {
                System.out.println("A File already exists.");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
