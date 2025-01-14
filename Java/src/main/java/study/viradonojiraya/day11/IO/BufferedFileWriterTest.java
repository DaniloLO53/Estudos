package study.viradonojiraya.day11.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        boolean appendToFile = true;

        try(FileWriter fileWriter = new FileWriter(file, appendToFile)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\nTerceiro texto");
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
