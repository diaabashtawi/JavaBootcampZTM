package readingandwritting.exercises;

import java.io.FileNotFoundException;


public class MainApp {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destination = "destination.txt";
        try {
            CopyFile.copyFile(sourcePath, destination);
            System.out.println("File Copied successfully");
        }catch (FileNotFoundException e){
            System.out.println("ERROR: FILE NOT FOUND." + e.getMessage());
        }
    }
}
