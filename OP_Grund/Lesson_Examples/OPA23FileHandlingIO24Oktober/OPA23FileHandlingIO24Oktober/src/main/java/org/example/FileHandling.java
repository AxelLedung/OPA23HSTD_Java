package org.example;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    public void run() {
        File file = new File("file.txt"); // Local path.
        File absolutePathFile = new File("C:\\Users\\nikla\\source\\java\\OPA23FileHandlingIO24Oktober\\src\\main\\file.txt"); // Absolute path.

        // When we're doing file-handling, the program will complain unless they're
        // in try-catches. This is because handling files outside the program can
        // always crash if the path of the file we want to get does not exist.
        try {
            // FileWriter is an object used for writing to files. It requires the file as a parameter.
            FileWriter writer = new FileWriter(absolutePathFile);
            writer.write("Hi!"); // Write will then write to the file in question. If it does not exist, write will create it.
            writer.close(); // The FileWriter will occupy the other file, making it unusable to other programs.
            // We want to close our connection to other files when we're done with them. FileWriter will also not write
            // to the file until we use the close() command, writing just before we close the connection.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // file.exists() is a function that gives true if the file/folder exists.
        if (!file.exists()) {
            System.out.println("file.txt does not exist.");
        }
        else {
            System.out.println("file.txt does exist.");
        }
        try {
            // FileWriter takes a boolean after the file. This is append, and can be true or false.
            // If it's false, which is default, it will overwrite the text that is there.
            // If it is true, then we add to the end of the file we're writing to.
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Hello!\nHello!"); // \n is the special character new line. Use it to simulate enter-presses.
            fileWriter.close();
        }
        catch (IOException e) {

        }

        File imAFolder = new File("folder");
        if (!imAFolder.exists()) { // Only need to create the folder if it doesn't exist.
            imAFolder.mkdir(); // Create a folder.
        }
        File imInAFolder = new File("folder/file.txt");
        try {
            imInAFolder.createNewFile(); // Creates a new file, without anything in it.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (imAFolder.isFile()) { // This checks if a File object is a file.
            System.out.println("imAFolder is a file!");
        }
        if (imAFolder.isDirectory()) { // This checks if a File object is a folder. Both are put into File.
            System.out.println("imAFolder is a folder!");
        }
        System.out.println("imInAFolder has the path " + imInAFolder.getPath()); // This retrieves a file's local path.
        String absolutePath = imInAFolder.getAbsolutePath(); // This retrieves a file's absolute path.
        System.out.println("imInAFolder lies at " + absolutePath);

        System.out.println("imInAFolder is in " + imInAFolder.getParent()); // This gets a file's containing folder's name.
        System.out.println("imInAFolder is in " + imInAFolder.getParentFile().getPath()); // getParentFile gets the containing folder as a File object.

        try {
            FileWriter fw = new FileWriter(imInAFolder); // BufferedWriter is generally preferred over FileWriter.
            BufferedWriter bw = new BufferedWriter(fw); // It takes a FileWriter as a parameter, for it uses it.
            bw.write("Hey"); // bw does not write directly to file
            bw.newLine();
            bw.write("Hi"); // instead saves to internal memory what to write when they're done
            bw.newLine();
            bw.write("How"); // This because we want to write to a file as few times as possible.
            bw.newLine();
            bw.flush(); // flush takes that internal memory and writes to file, without closing.
            bw.write("Are");
            bw.newLine(); // New line creates a new line symbol, visually displayed as going to the next line.
            bw.newLine();
            bw.write("You");
            bw.close(); // Close contains a flush() first, before closing the connection.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // FileReader I recommend using on its own never.
        char[] charArray = new char[1000]; // It requires a char-array that is long enough.
        try {
            FileReader fileReader = new FileReader(imInAFolder);
            fileReader.read(charArray); // Then, send in the array, and the contents of the file will be put into it.
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String newString = new String(charArray).trim(); // Make the array into a string by sending it into String's constructor,
        // which is otherwise like never used. trim() is a function that will remove all unused spaces from the string.
        System.out.println(newString); // That would be how we read using FileReader on its own.

        try { // Much rather use BufferedReader.
            FileReader fr = new FileReader(imInAFolder);
            BufferedReader br = new BufferedReader(fr); // BufferedReader takes a FileReader as parameter.
            System.out.println("With BufferedReader");
            String line = br.readLine(); // readLine() will give the next line if it exists, otherwise null.
            while(line != null) { // If the next line exists
                System.out.println(line); // we can do stuff with it.
                line = br.readLine(); // At the end of the loop, read the next line and go back to the start of the loop.
            } // This should read out all the contents of the file.
            br.close();
        }
        catch (IOException e) {

        }

        try { // We can also use Scanner to read files.
            Scanner scanner = new Scanner(imInAFolder); // Send in the file.
            System.out.println("With scanner");
            while (scanner.hasNextLine()) { // As long as the next line exist
                System.out.println(scanner.nextLine()); // We can do something with the next line.
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // A common way of storing objects is as CSV-files. Comma-Separated-Values
        // It is files in which the objects are saved with commas separating the various values.
        // Jake, here, for instance would become Jake,29,mail
        // Different objects are separated via new lines.
        Person[] people = new Person[] {
                new Person("Jake", 29, "mail"),
                new Person("Jim", 23, "@"),
                new Person("Louie", 21, "mail"),
                new Person("Genevere", 26, ".com")
        };

        // I create a new file to contain my people.
        File personFile = new File("personFile.txt");
        try {
            boolean append = false; // In case I want to append.
            FileWriter fileWriter = new FileWriter(personFile, append);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            if (append) { // If I am appending, I want to go to a new line first.
                writer.newLine();
            }
            for (int i = 0; i < people.length; i++) { // I loop through my people
                writer.write(people[i].getCSV()); // I have a function that returns the CSV of my object
                if (i < people.length-1) { // If it is not the last element
                    writer.newLine(); // write a new line for the next element as well.
                }
            }
            writer.close(); // Don't forget to close!
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Now to read Person objects from a file!
        ArrayList<Person> readPeople = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(personFile);
            while (scanner.hasNextLine()) { // While there's one more line
                String csv = scanner.nextLine(); // Read in the next line.
                String[] variables = csv.split(","); // split will create an array, separating the values based on what I send in. Commas, in this case.
                // Name will be index 0, age index 1, and email index 2.
                int age = Integer.parseInt(variables[1]); // Age is a number, so I need to make it a number first.
                Person person = new Person(variables[0], age, variables[2]); // Then I can create a new object with the appropriate variables from the file.
                readPeople.add(person); // Then add that one to a list!
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Then I can loop through and post them!
        for (Person person: readPeople) {
            System.out.println("Read " + person.getCSV() + " as an object.");
        }
    }
}
