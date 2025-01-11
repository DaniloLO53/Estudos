package study.viradonojiraya.day8.ErrorsAndExceptions.service;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {

    }

    public static void readFile2() {
        try(Reader reader = new BufferedReader(new FileReader(" test.txt"))) {

        } catch (IOException e) {

        }
    }

    public static void readFile1() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
