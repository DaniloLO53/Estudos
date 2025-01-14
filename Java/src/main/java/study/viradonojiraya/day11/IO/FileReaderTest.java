package study.viradonojiraya.day11.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            FileReader fileReader = new FileReader(file);
//            char[] in = new char[10];
//            fileReader.read(in);
//            for (char c: in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

            System.out.println(fileReader.read());

            fileReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
