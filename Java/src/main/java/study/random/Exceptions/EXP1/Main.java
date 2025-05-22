package study.random.Exceptions.EXP1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        createNewFile();
        div(10, 2);
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
