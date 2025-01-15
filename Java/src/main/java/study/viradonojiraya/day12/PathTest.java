package study.viradonojiraya.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path dirPath = Paths.get("tests");

        try {
            Path dir = Files.createDirectory(dirPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
