package study.random.Exceptions.EXP1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        createNewFile();
        div(10, 2);
    }

    private static void fileReader2() {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileReader1() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("text.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }

        }
    }

    private static void createNewFile() {
        File file = new File("text.txt");
        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a/b;
    }
}
