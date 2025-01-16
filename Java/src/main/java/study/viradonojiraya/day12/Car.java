package study.viradonojiraya.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Smartphone {
    public static void main(String[] args) {
        String a = "A";
        String b = new String("A");

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
    }
}
