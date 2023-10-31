import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static File folder = new File("assets");
    public static File file = new File("assets/Hello.txt");
    public static void main(String[] args) {
        //FileManager fileManager = new FileManager();
        //String folder = fileManager.CreateFolder("testFolder");
        //fileManager.CreateFile("testFolder/testFile.txt");
        //fileManager.WriteInFile(file, "Vad händer om  jag skriver en till rad-", true);
        folder.mkdir();
        try {
            if (!folder.exists()) {
                folder.createNewFile();
                CreateFile();
            }
            else {
                System.out.println("Folder already exists.");
                CreateFile();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Uppgift 4---------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("test");
        try {
            FileWriter fileWriter = new FileWriter(file);
            System.out.println("Vad ska det stå i nästa rad:");
            String input = "";
            while (!input.equals("quit")) {
                input = scanner.nextLine();
                if (!input.equals("quit")) {
                    fileWriter.write(input + "\n");
                    System.out.println("1");
                }
                else {

                }
            }
            System.out.println("2");
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader(file);
            scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        // Uppgift 5--------------


    }
    public static void CreateFile() {
        try {
            if (!file.exists()) {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("Testar att skriva i detta dokument.");
                fileWriter.close();
                System.out.println("File created at " + file.getAbsolutePath());
            }
            else if (file.getName() == "Hello.txt") {
                System.out.println("File " + file.getName() + " Exists at: " + file.getAbsolutePath());
            }
            else {
                System.out.println("A File already exists.");
                System.out.println(file.getAbsolutePath());
                if (file.getName() == "Hello.txt") {
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
                System.out.println(file.getName());
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}