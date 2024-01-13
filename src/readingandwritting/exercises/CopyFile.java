package readingandwritting.exercises;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void  copyFile(String sourcePath, String destinationPath) throws FileNotFoundException {
        try(FileReader reader = new FileReader(sourcePath);
            FileWriter writer = new FileWriter(destinationPath)) {
            int characters;
            while ((characters = reader.read()) != -1){
                writer.write(characters);
            }
        }catch (IOException e){
            System.out.println("Error reading or writing file : " + e.getMessage());
        }
    }
}
