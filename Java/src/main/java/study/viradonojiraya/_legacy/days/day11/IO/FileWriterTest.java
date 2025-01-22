package study.viradonojiraya._legacy.days.day11.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        boolean appendToFile = true;

        try(FileWriter fileWriter = new FileWriter(file, appendToFile)) {
            fileWriter.write("\nTexto");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
