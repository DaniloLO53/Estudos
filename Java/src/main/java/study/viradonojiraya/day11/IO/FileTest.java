package study.viradonojiraya.day11.IO;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Absolute path:" + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
//
//            if(file.exists()) {
//                file.delete();
//            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
