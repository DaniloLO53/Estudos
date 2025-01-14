package study.viradonojiraya.day11.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderTest {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            char[] in = new char[10];
//            fileReader.read(in);
//            for (char c: in) {
//                System.out.print(c);
//            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }

            fileReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
