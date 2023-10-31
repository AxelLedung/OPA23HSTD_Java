import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    /*public void CreateFile(String path) {
        //File textFile = new File(path);

        try {
            /*FileWriter fileWriter = new FileWriter(textFile);
            fileWriter.write("Hello!");
            fileWriter.close();
            File textFile = new File(path);
            if (textFile.createNewFile()) {
                System.out.println("File created: " + textFile);
            }
            else {
                System.out.println("File already exists");
            }
            return path;
        }
        catch (IOException e){
            System.out.println(path + " was failed to be created.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public String CreateFolder(String path) {
        File folder = new File(path);
        folder.mkdir();
        try {
            folder.createNewFile();
            return path;
        }
        catch (IOException e) {
            System.out.println(path + " was failed to be created.");
            throw new RuntimeException(e);
        }
    }
    public String WriteInFile(String path, String string, boolean b) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, b);
            fileWriter.write(string);
            fileWriter.close();
            return path;
        }
        catch (IOException e) {
            System.out.println(string + " failed to be written in: " + path);
            throw new RuntimeException(e);
        }
    }*/
}
